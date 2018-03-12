/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_internationalizedwarehouse;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class StorageItem {

    private String picPath;
    private String item;
    private int prize;
    private int id;

    public StorageItem() {

    }

    public StorageItem(int id, String picPath, String item, int amount) {
        this.id = id;
        this.picPath = picPath;
        this.item = item;
        this.prize = amount;
    }

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute(name = "picPath")
    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    @XmlAttribute(name = "name")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @XmlAttribute(name = "prize")
    public int getPrize() {
        return prize;
    }

    public void setPrize(int amount) {
        this.prize = amount;
    }
}
