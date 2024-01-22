public class GSShopFactory extends ShopFactory {
    @Override
    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSPrimeAcc(accNo, accNm, charges, isPrime);
    }

    @Override
    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges) {
      	
        float deliveryCharges = 5.0f;
        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
    }
}
