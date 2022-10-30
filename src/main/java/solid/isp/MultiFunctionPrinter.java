package solid.isp;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
  @Override
  public void Fax() {
    System.out.println("MultiFunctionPrinter fax...");
  }

  @Override
  public void Print() {
    System.out.println("MultiFunctionPrinter print...");
  }

  @Override
  public void Scan() {
    System.out.println("MultiFunctionPrinter scan...");
  }
}
