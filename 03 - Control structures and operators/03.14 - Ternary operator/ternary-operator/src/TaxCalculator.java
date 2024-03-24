public class TaxCalculator {
    public static void main(String[] args) {
        char invoiceType = 'P';
        double totalBilled = 1200.89;
        double taxesValue;

        /*
        ***************************
//        if (invoiceType == 'S') {
//            taxesValue = totalBilled * 0.16;
//        } else {
//            taxesValue = totalBilled * 0.35;
//        }
        */

//        taxesValue = invoiceType == 'S' ? totalBilled * 0.16 : totalBilled * 0.35;

        double taxRate = invoiceType == 'S' ? 0.16 : 0.35;
        taxesValue = totalBilled * taxRate;

        System.out.printf("Taxes value: R$ %.2f%n", taxesValue);
    }
}