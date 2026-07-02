public class SearchOperations {

    public static Product linearSearch(Product[] productList, int searchId) {

        for (Product item : productList) {

            if (item.getId() == searchId) {
                return item;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] productList, int searchId) {

        int start = 0;
        int end = productList.length - 1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (productList[middle].getId() == searchId) {
                return productList[middle];
            }

            if (productList[middle].getId() < searchId) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return null;
    }
}