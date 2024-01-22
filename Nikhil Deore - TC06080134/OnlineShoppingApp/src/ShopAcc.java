public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;
    private float totalDeliveryCharges;
    private float totalCharges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public abstract void bookProduct(float items);

    public float getCharges() {
        return charges;
    }
    
    public void setTotalDeliveryCharges(float totalDeliveryCharges) {
        this.totalDeliveryCharges = totalDeliveryCharges;
    }
    public void setTotalCharges(float totalCharges) {
        this.totalCharges = totalCharges;
    }

    public String toString() {
        return "Bill :" + '\n' +
                "Account No :" + accNo + '\n' +
                "Account Name : " + accNm + '\n' +
                "Total Amount: $" + (totalCharges) + '\n' +
                "Total Delivery Charges: $" + totalDeliveryCharges + '\n' +
                "---------------------------------";
    }
}
