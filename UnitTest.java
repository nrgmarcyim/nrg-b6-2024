import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxCalcTest  {
    @Test
    public void testBasicIncome(){
        TaxCalc calc = new TaxCalc();
        double netpay = calc.calculateTax(10_000);
        assertEquals(9000,netpay,"invalid");
    }
    @Test
    public void testMidIncome(){
        TaxCalc calc = new TaxCalc();
        double netpay = calc.calculateTax(20_000);
        assertEquals(17_000,netpay,"invalid");
    }
    @Test
    public void testHighIncome(){
        TaxCalc calc = new TaxCalc();
        double netpay = calc.calculateTax(70_000);
        assertEquals(56_000,netpay,"above P50,000 must have a 20% deduction");
    }
    @Test
    public void testZeroIncome(){
        TaxCalc calc = new TaxCalc();
        double netpay = calc.calculateTax(0);
        assertEquals(0,netpay,"invalid");
    }
    @Test
    public void testNegativeIncome(){
        TaxCalc calc = new TaxCalc();
        double netpay = calc.calculateTax(-10000);
        assertEquals(0,netpay,"invalid");
    }

}