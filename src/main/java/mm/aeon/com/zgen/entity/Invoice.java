package mm.aeon.com.zgen.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Invoice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.subject
     *
     * @mbg.generated
     */
    private String subject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.date
     *
     * @mbg.generated
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.payment_due_date
     *
     * @mbg.generated
     */
    private Date paymentDueDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.invoice_no
     *
     * @mbg.generated
     */
    private String invoiceNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.sub_total
     *
     * @mbg.generated
     */
    private BigDecimal subTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.tax_amount
     *
     * @mbg.generated
     */
    private BigDecimal taxAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.grand_total
     *
     * @mbg.generated
     */
    private BigDecimal grandTotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.currency
     *
     * @mbg.generated
     */
    private String currency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.customer_dealer_name
     *
     * @mbg.generated
     */
    private String customerDealerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.contact_name
     *
     * @mbg.generated
     */
    private String contactName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.created_by
     *
     * @mbg.generated
     */
    private Integer createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.updated_by
     *
     * @mbg.generated
     */
    private Integer updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.delete_flg
     *
     * @mbg.generated
     */
    private Boolean deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.dealer_id
     *
     * @mbg.generated
     */
    private Integer dealerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.created_date
     *
     * @mbg.generated
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.invoice.updated_date
     *
     * @mbg.generated
     */
    private Date updatedDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.id
     *
     * @return the value of public.invoice.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.id
     *
     * @param id the value for public.invoice.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.subject
     *
     * @return the value of public.invoice.subject
     *
     * @mbg.generated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.subject
     *
     * @param subject the value for public.invoice.subject
     *
     * @mbg.generated
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.date
     *
     * @return the value of public.invoice.date
     *
     * @mbg.generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.date
     *
     * @param date the value for public.invoice.date
     *
     * @mbg.generated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.payment_due_date
     *
     * @return the value of public.invoice.payment_due_date
     *
     * @mbg.generated
     */
    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.payment_due_date
     *
     * @param paymentDueDate the value for public.invoice.payment_due_date
     *
     * @mbg.generated
     */
    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.invoice_no
     *
     * @return the value of public.invoice.invoice_no
     *
     * @mbg.generated
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.invoice_no
     *
     * @param invoiceNo the value for public.invoice.invoice_no
     *
     * @mbg.generated
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.sub_total
     *
     * @return the value of public.invoice.sub_total
     *
     * @mbg.generated
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.sub_total
     *
     * @param subTotal the value for public.invoice.sub_total
     *
     * @mbg.generated
     */
    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.tax_amount
     *
     * @return the value of public.invoice.tax_amount
     *
     * @mbg.generated
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.tax_amount
     *
     * @param taxAmount the value for public.invoice.tax_amount
     *
     * @mbg.generated
     */
    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.grand_total
     *
     * @return the value of public.invoice.grand_total
     *
     * @mbg.generated
     */
    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.grand_total
     *
     * @param grandTotal the value for public.invoice.grand_total
     *
     * @mbg.generated
     */
    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.currency
     *
     * @return the value of public.invoice.currency
     *
     * @mbg.generated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.currency
     *
     * @param currency the value for public.invoice.currency
     *
     * @mbg.generated
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.type
     *
     * @return the value of public.invoice.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.type
     *
     * @param type the value for public.invoice.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.customer_dealer_name
     *
     * @return the value of public.invoice.customer_dealer_name
     *
     * @mbg.generated
     */
    public String getCustomerDealerName() {
        return customerDealerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.customer_dealer_name
     *
     * @param customerDealerName the value for public.invoice.customer_dealer_name
     *
     * @mbg.generated
     */
    public void setCustomerDealerName(String customerDealerName) {
        this.customerDealerName = customerDealerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.contact_name
     *
     * @return the value of public.invoice.contact_name
     *
     * @mbg.generated
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.contact_name
     *
     * @param contactName the value for public.invoice.contact_name
     *
     * @mbg.generated
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.created_by
     *
     * @return the value of public.invoice.created_by
     *
     * @mbg.generated
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.created_by
     *
     * @param createdBy the value for public.invoice.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.updated_by
     *
     * @return the value of public.invoice.updated_by
     *
     * @mbg.generated
     */
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.updated_by
     *
     * @param updatedBy the value for public.invoice.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.delete_flg
     *
     * @return the value of public.invoice.delete_flg
     *
     * @mbg.generated
     */
    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.delete_flg
     *
     * @param deleteFlg the value for public.invoice.delete_flg
     *
     * @mbg.generated
     */
    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.dealer_id
     *
     * @return the value of public.invoice.dealer_id
     *
     * @mbg.generated
     */
    public Integer getDealerId() {
        return dealerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.dealer_id
     *
     * @param dealerId the value for public.invoice.dealer_id
     *
     * @mbg.generated
     */
    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.created_date
     *
     * @return the value of public.invoice.created_date
     *
     * @mbg.generated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.created_date
     *
     * @param createdDate the value for public.invoice.created_date
     *
     * @mbg.generated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.invoice.updated_date
     *
     * @return the value of public.invoice.updated_date
     *
     * @mbg.generated
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.invoice.updated_date
     *
     * @param updatedDate the value for public.invoice.updated_date
     *
     * @mbg.generated
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.invoice
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", subject=").append(subject);
        sb.append(", date=").append(date);
        sb.append(", paymentDueDate=").append(paymentDueDate);
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", subTotal=").append(subTotal);
        sb.append(", taxAmount=").append(taxAmount);
        sb.append(", grandTotal=").append(grandTotal);
        sb.append(", currency=").append(currency);
        sb.append(", type=").append(type);
        sb.append(", customerDealerName=").append(customerDealerName);
        sb.append(", contactName=").append(contactName);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", deleteFlg=").append(deleteFlg);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append("]");
        return sb.toString();
    }
}