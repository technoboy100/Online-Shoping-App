public abstract class PrimeAcc extends ShopAcc {
    private static final float DELIVERY_CHARGES = 5.0f;
    private final boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float items) {
        float totalCharges = items * getCharges();
        if (isPrime) {
//            System.out.println("Booking Prime product with total charges: $" + totalCharges);
            setTotalDeliveryCharges(0.f);
            setTotalCharges(totalCharges);
        } else {
//            System.out.println("Booking product with total charges: $" + (totalCharges + DELIVERY_CHARGES));
            setTotalDeliveryCharges(DELIVERY_CHARGES);
            setTotalCharges(totalCharges + DELIVERY_CHARGES);
        }
        
    }
}
