package jp.co.oracle.samples.beans;

import java.util.Date;
import javax.faces.view.ViewScoped;
import javax.mail.Address;

/**
 *
 * @author Yoshio Terada
 */
@ViewScoped
public class MailHeader {

    private String subject;
    private Address[] fromAddress;
    private Date sendDate;
    private int size;
    private Integer messageCount;
    

    /**
     * Creates a new instance of MessageModelBean
     */
    public MailHeader() {
    }

    public MailHeader(String subject, Address[] fromAddress, Date sendDate, int size, Integer messageCount) {
        this.subject = subject;
        this.fromAddress = fromAddress;
        this.sendDate = sendDate;
        this.size = size ;
        this.messageCount = messageCount;
    }    
    
    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the fromAddress
     */
    public Address[] getFromAddress() {
        return fromAddress;
    }

    /**
     * @param fromAddress the fromAddress to set
     */
    public void setFromAddress(Address[] fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * @return the sendDate
     */
    public Date getSendDate() {
        return sendDate;
    }

    /**
     * @param sendDate the sendDate to set
     */
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the messageCount
     */
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * @param messageCount the messageCount to set
     */
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }
}
