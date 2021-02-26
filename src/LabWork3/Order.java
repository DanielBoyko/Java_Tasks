package LabWork3;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Order {
    String id;
    String customerLogin;
    HashMap<Medication, Integer> medications;
    Date dateOfOrdering;

    public String getId() {
        return this.id;
    }

    public String getUserLogin() {
        return this.customerLogin;
    }

    public HashMap<Medication, Integer> getMedications() {
        return this.medications;
    }

    public boolean deleteMedicationFromOrder(String title) {
        if (getDateDiff(dateOfOrdering, new Date(System.currentTimeMillis()), TimeUnit.HOURS) < 6) {
            var medicationSearchResult =  medications.keySet()
                    .stream()
                    .filter(medication->medication.getTitle().equals(title))
                    .findFirst()
                    .orElse(null);

            if(medicationSearchResult!=null){
                medications.remove(medicationSearchResult);
                return true;
            }
        }
        return false;
    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diff = date2.getTime() - date1.getTime();
        return timeUnit.convert(diff, TimeUnit.MILLISECONDS);
    }

    public boolean isOrderNeedForConfirm() {
        for (Map.Entry<Medication, Integer> entry : medications.entrySet()) {
            if (entry.getKey().isNeedForConfirm) {
                return true;
            }
        }
        return false;
    }

    public Order(String customerLogin, HashMap<Medication, Integer> medications) {
        this.id = UUID.randomUUID().toString();
        this.customerLogin = customerLogin;
        this.medications = medications;
        this.dateOfOrdering = new Date(System.currentTimeMillis());
    }
}
