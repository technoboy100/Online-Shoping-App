public abstract class NormalAcc extends ShopAcc {
    private static final float DELIVERY_CHARGES = 5.0f;

    public NormalAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    @Override
    public void bookProduct(float items) {
    	
        float totalCharges = items * getCharges() + DELIVERY_CHARGES;
        setTotalDeliveryCharges(DELIVERY_CHARGES);
        setTotalCharges(totalCharges);
    }
}
