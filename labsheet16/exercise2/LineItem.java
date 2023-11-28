package labsheet16.exercise2;

public class LineItem {
        private int id;
        private int quantity;
        private Product product;

        public LineItem(int id, int quantity, Product product) {
            setId(id);
            setQuantity(quantity);
            setProduct(product);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
           this.product = product;
        }

        public String toString() {
            return "id: " + getId() + "  quantity:" + getQuantity() + "  " + getProduct();
        }
}

