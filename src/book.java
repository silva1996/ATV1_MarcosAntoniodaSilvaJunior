    import java.util.Locale;

    public class book {
        private String name;
        private author Author;
        private double price;
        private int qtyInStock=0;

        public book (String name, author Author, double price, int qtyInStock){
            this.name = name.toUpperCase(Locale.ROOT);
            this.Author = Author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        public String getName() {
            return name;
        }

        public author getAuthor() {
            return Author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQtyInStock() {
            return qtyInStock;
        }

        public void setQtyInStock(int qtyInStock) {
            this.qtyInStock = qtyInStock;
        }

        @Override
        public String toString() {
            return "book{" +
                    "name='" + name + '\'' +
                    ", Author=" + Author +
                    ", price=" + price +
                    ", qtyInStock=" + qtyInStock +
                    '}';
        }
    }
