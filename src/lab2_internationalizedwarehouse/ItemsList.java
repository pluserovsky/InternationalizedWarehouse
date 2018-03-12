/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_internationalizedwarehouse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luk
 */
@XmlRootElement(name = "itemsList")
public class ItemsList {

    private List<StorageItem> storageItems = new ArrayList<>();

    public void add(StorageItem item) {
        this.storageItems.add(item);
    }

    public void remove(StorageItem item) {
        this.storageItems.remove(item);
    }

    public StorageItem getItem(int id) {
        for (int i = 0; i < storageItems.size(); i++) {
            if (storageItems.get(i).getId() == id) {
                return storageItems.get(i);
            }
        }
        return null;
    }

    @XmlElements(
            @XmlElement(name = "item"))
    public List<StorageItem> getStorageItems() {
        return storageItems;
    }

    public void setStorageItems(List<StorageItem> storageItems) {
        this.storageItems = storageItems;
    }

}
