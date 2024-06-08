public class Product {
    int id; String name, type;
    float price, rating;
    public Product(int a, String b, float c, String d, float e) {
        id = a; name = b; price = c; type = d; rating = e;
    }
    public int getId() { return id; }
    public void setId(int a) { id = a; }
    public String getName() { return name; }
    public void setName(String a) { name = a; }
    public float getPrice() { return price; }
    public void setPrice(float a) { price = a; }
    public String getType() { return type; }
    public void setType(String a) { type = a; }
    public float getRating() { return rating; }
    public void setRating(float a) { rating = a; }
}

public class ProductOperations {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 1200.00, "Electronics", 4.5),
            new Product(2, "Smartphone", 800.00, "Electronics", 4.7),
            new Product(3, "Tablet", 500.00, "Electronics", 4.2),
            new Product(4, "Refrigerator", 1500.00, "Appliances", 4.8),
            new Product(5, "Washing Machine", 700.00, "Appliances", 3.9),
            new Product(6, "TV", 300.00, "Electronics", 4.4),
            new Product(7, "Blender", 50.00, "Appliances", 4.1),
            new Product(8, "Camera", 450.00, "Electronics", 3.8),
            new Product(9, "Microwave", 150.00, "Appliances", 4.6)
        );

        // i) Find all the products having rating between 4 and 5.
        List<Product> highRatedProducts = products.stream()
            .filter(p -> p.getRating() >= 4 && p.getRating() <= 5)
            .collect(Collectors.toList());
        System.out.println("Products with rating between 4 and 5:");
        highRatedProducts.forEach(System.out::println);

        // ii) Find first n products having price > 10000.
        int n = 2; // Example value for n
        List<Product> expensiveProducts = products.stream()
            .filter(p -> p.getPrice() > 10000)
            .limit(n)
            .collect(Collectors.toList());
        System.out.println("\nFirst " + n + " products with price > 10000:");
        expensiveProducts.forEach(System.out::println);

        // iii) Find the number of products under each type (map containing type and count).
        Map<String, Long> productCountByType = products.stream()
            .collect(Collectors.groupingBy(Product::getType, Collectors.counting()));
        System.out.println("\nNumber of products under each type:");
        productCountByType.forEach((type, count) -> System.out.println(type + ": " + count));

        // iv) Find average rating of products with type = "Electronics".
        double avgRatingElectronics = products.stream()
            .filter(p -> "Electronics".equals(p.getType()))
            .collect(Collectors.averagingDouble(Product::getRating));
        System.out.println("\nAverage rating of Electronics products: " + avgRatingElectronics);
    }
}
