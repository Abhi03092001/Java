public class LinearProbing<Key, Value> {
    private class HashTableNode {
        private Key key;
        private Value value;
        private boolean active;
        private boolean tombstoned; // Allow reuse of removed slots

        public HashTableNode() {
// All nodes in array will begin initialized this way
            key = null;
            value = null;
            active = false;
            tombstoned = false;
        }

        public HashTableNode(Key initKey, Value initData) {
            key = initKey;
            value = initData;
            active = true;
            tombstoned = false;
        }
    }
}

