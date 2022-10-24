package Model;

public class InvoiceLine {
    private String InvoiceName;
    private Integer ItemPrice;
    private Integer Count;

public InvoiceLine(String InvoiceName , Integer ItemPrice ,  Integer Count){
    this.InvoiceName=InvoiceName;
    this.Count=Count;
    this.ItemPrice=ItemPrice;

}

public String getInvoiceName()
{
    return this.InvoiceName;

}

    public Integer getCount() {
        return this.Count;
    }
    public Integer getItemPrice() {
        return this.ItemPrice;
    }
}
