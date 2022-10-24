package Model;

public class InvoiceHeader {
private Integer InvoiceNum;
private Integer InvoiceDate;
private String CustomerName;
//private ArrayList<> ;

public InvoiceHeader(Integer InvoiceNum,Integer InvoiceDate,String CustomerName)
{
 this.InvoiceNum=InvoiceNum;
 this.InvoiceDate=InvoiceDate;
 this.CustomerName=CustomerName;
}

    public Integer getInvoiceNum() {
        return InvoiceNum;
    }


    public Integer getInvoiceDate() {
        return InvoiceDate;
    }


    public String getCustomerName() {
        return CustomerName;
    }


}
