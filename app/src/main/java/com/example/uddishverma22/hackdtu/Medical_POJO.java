package com.example.uddishverma22.hackdtu;

import android.support.v7.widget.RecyclerView;

/**
 * Created by uddishverma22 on 11/02/17.
 */

public class Medical_POJO {

    public static class MedicalDetails{
        String name;
        String age;
        String bloodGroup;
        String height;
        String weight;
        String prevMedDetails;
        String id;

        public MedicalDetails() {

        }

        public MedicalDetails(String id, String name,String age, String bloodGroup, String height, String weight, String prevMedDetails) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.bloodGroup = bloodGroup;
            this.height = height;
            this.weight = weight;
            this.prevMedDetails = prevMedDetails;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getBloodGroup() {
            return bloodGroup;
        }

        public void setBloodGroup(String bloodGroup) {
            this.bloodGroup = bloodGroup;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getPrevMedDetails() {
            return prevMedDetails;
        }

        public void setPrevMedDetails(String prevMedDetails) {
            this.prevMedDetails = prevMedDetails;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }


    }
}
