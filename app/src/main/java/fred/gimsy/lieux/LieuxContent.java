package fred.gimsy.lieux;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class LieuxContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "Hopital", "La Timone"));
        addItem(new DummyItem("2", "Stade", "Stade de France"));
        addItem(new DummyItem("3", "Musée", "Le Louvre"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String type;
        public String nom;

        public DummyItem(String id, String type, String nom) {
            this.id = id;
            this.type = type;
            this.nom = nom;
        }

        @Override
        public String toString() {

            return nom;
        }
    }
}
