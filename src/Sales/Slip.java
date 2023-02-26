package Sales;

public class Slip {
    private  int salesPersonNumber;
    private Product product;

    public int getSalesPersonNumber() {
        return salesPersonNumber;
    }

    public void setSalesPersonNumber(int salesPersonNumber) {
        this.salesPersonNumber = salesPersonNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotalValueOfProductSoldPerDay() {
        return totalValueOfProductSoldPerDay;
    }

    public void setTotalValueOfProductSoldPerDay(int totalValueOfProductSoldPerDay) {
        this.totalValueOfProductSoldPerDay = totalValueOfProductSoldPerDay;
    }

    private  int totalValueOfProductSoldPerDay;
}
