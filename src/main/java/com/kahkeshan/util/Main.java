package com.kahkeshan.util;

import com.kahkeshan.biz.StudentService;
import com.kahkeshan.data.entities.Profile;
import com.kahkeshan.ui.models.StudentDTO;

public class Main {

    public static void main(String[] args) {
        StudentDTO dto = new StudentDTO("ali","alavi","math", null);
        Profile profile = new Profile("muzik", "http://youtube/xyz","alavi@gmail.com");
        dto.setProfile(profile);
        StudentService service = new StudentService();
        try {
            service.save(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
