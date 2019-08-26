package cashregister;

public class MockPrinter extends Printer {
    private String tempText = "";

    @Override
    public void print(String printThis) {
        super.print(printThis);

        tempText = printThis;
    }

    public String getTempText() {
        return tempText;
    }

    public void setPrinterText(String s) {
        this.tempText = s;
    }
}
