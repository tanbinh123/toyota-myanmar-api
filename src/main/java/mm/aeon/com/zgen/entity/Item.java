package mm.aeon.com.zgen.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.charges_id
     *
     * @mbg.generated
     */
    private Integer chargesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.unit
     *
     * @mbg.generated
     */
    private Integer unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.unit_price
     *
     * @mbg.generated
     */
    private BigDecimal unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.invoice_id
     *
     * @mbg.generated
     */
    private Integer invoiceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.created_by
     *
     * @mbg.generated
     */
    private Integer createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.updated_by
     *
     * @mbg.generated
     */
    private Integer updatedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.delete_flg
     *
     * @mbg.generated
     */
    private Boolean deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.created_date
     *
     * @mbg.generated
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.updated_date
     *
     * @mbg.generated
     */
    private Date updatedDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.item.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.id
     *
     * @return the value of public.item.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.id
     *
     * @param id the value for public.item.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.charges_id
     *
     * @return the value of public.item.charges_id
     *
     * @mbg.generated
     */
    public Integer getChargesId() {
        return chargesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.charges_id
     *
     * @param chargesId the value for public.item.charges_id
     *
     * @mbg.generated
     */
    public void setChargesId(Integer chargesId) {
        this.chargesId = chargesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.unit
     *
     * @return the value of public.item.unit
     *
     * @mbg.generated
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.unit
     *
     * @param unit the value for public.item.unit
     *
     * @mbg.generated
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.unit_price
     *
     * @return the value of public.item.unit_price
     *
     * @mbg.generated
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.unit_price
     *
     * @param unitPrice the value for public.item.unit_price
     *
     * @mbg.generated
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.amount
     *
     * @return the value of public.item.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.amount
     *
     * @param amount the value for public.item.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.invoice_id
     *
     * @return the value of public.item.invoice_id
     *
     * @mbg.generated
     */
    public Integer getInvoiceId() {
        return invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.invoice_id
     *
     * @param invoiceId the value for public.item.invoice_id
     *
     * @mbg.generated
     */
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.created_by
     *
     * @return the value of public.item.created_by
     *
     * @mbg.generated
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.created_by
     *
     * @param createdBy the value for public.item.created_by
     *
     * @mbg.generated
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.updated_by
     *
     * @return the value of public.item.updated_by
     *
     * @mbg.generated
     */
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.updated_by
     *
     * @param updatedBy the value for public.item.updated_by
     *
     * @mbg.generated
     */
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.delete_flg
     *
     * @return the value of public.item.delete_flg
     *
     * @mbg.generated
     */
    public Boolean getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.delete_flg
     *
     * @param deleteFlg the value for public.item.delete_flg
     *
     * @mbg.generated
     */
    public void setDeleteFlg(Boolean deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.created_date
     *
     * @return the value of public.item.created_date
     *
     * @mbg.generated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.created_date
     *
     * @param createdDate the value for public.item.created_date
     *
     * @mbg.generated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.updated_date
     *
     * @return the value of public.item.updated_date
     *
     * @mbg.generated
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.updated_date
     *
     * @param updatedDate the value for public.item.updated_date
     *
     * @mbg.generated
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.item.description
     *
     * @return the value of public.item.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.item.description
     *
     * @param description the value for public.item.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.item
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
        sb.append(", chargesId=").append(chargesId);
        sb.append(", unit=").append(unit);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", amount=").append(amount);
        sb.append(", invoiceId=").append(invoiceId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", deleteFlg=").append(deleteFlg);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}