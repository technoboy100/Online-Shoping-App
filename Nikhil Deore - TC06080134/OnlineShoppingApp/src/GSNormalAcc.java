public class GSNormalAcc extends NormalAcc {
    private float deliveryCharges;

    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }
}
