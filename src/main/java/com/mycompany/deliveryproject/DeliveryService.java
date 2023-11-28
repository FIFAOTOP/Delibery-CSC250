package com.mycompany.deliveryproject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class DeliveryService {
    private String trackId;
    private Sender sender;
    private Recipient recipient;
    private Date timeStamp;
    private String serviceStatus;
    private Customer customer;
    private Parcel parcel;
    private String trackingStatus;

    public DeliveryService(String trackID,Sender sender, Recipient recipient, Parcel parcel, Date timeStamp, String serviceStatus) {
        this.sender = sender;
        this.recipient = recipient;
        this.parcel = parcel;
        this.timeStamp = timeStamp;
        this.serviceStatus = serviceStatus;
        
        this.makeDelivery(trackID, sender,  recipient, parcel.getWeight(),  parcel.getContents(),  (parcel.getShippingMethod()=="Fresh"? true : false),  timeStamp);
    }
    
    public void makeDelivery(String trackingID, Sender sender, Recipient recipient, double weight, String content, boolean isFresh, Date timeStamp) {
          // เมธอดเขียนลงในไฟล์ record.txt
         try {
             // เปลี่ยนเส้นทางไปที่ไฟล์ record.txt ของคุณ
             String filePath = "D:\\CSC250\\Delivery project\\src\\main\\java\\db\\record.txt";

             // เปิดไฟล์เพื่อเขียน (true หมายถึงให้เพิ่มเข้าไปเป็นข้อมูลเสริม)
             FileWriter fileWriter = new FileWriter(filePath, true);
             PrintWriter printWriter = new PrintWriter(fileWriter);

             File file = new File(filePath);
             long fileSize = file.length();

             // ตรวจสอบว่าไฟล์ว่างหรือไม่ (ถ้าว่างให้เพิ่มหัวตาราง)
             if (fileSize == 0) {
                 printWriter.println("Tracking ID,Sender Name,Sender Address,Sender Phone Number,Receiver Name,Receiver Address,Receiver Phone Number,Parcel Content,Weight,Parcel Type,Status,Timestamp");
             }
             // เขียนข้อมูลลงในไฟล์
             printWriter.println(trackingID + "," +
                     sender.getName() + "," +
                     sender.getAddress() + "," +
                     sender.getPhone() + "," +
                     recipient.getName() + "," +
                     recipient.getAddress() + "," +
                     recipient.getPhone() + "," +
                     content + "," +
                     weight + "," +
                     (isFresh ? "Fresh" : "Dry") + "," +
                     "In Transit" + "," +
                     timeStamp);

             System.out.print("successsss");
             // ปิดไฟล์
             printWriter.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public String getTrackingStatus() {
        return trackingStatus;
    }

    public void setTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
    }
  
}
