package services.impl;

import org.springframework.stereotype.Service;
import services.TuDien;

import java.util.HashMap;
import java.util.Map;

@Service
public class TuDienImpl implements TuDien {
    static Map<String,String> tuDien = new HashMap<>();
    static {
        tuDien.put("Xin Chao","Hello");
        tuDien.put("Xe Dap","Bicycle");
        tuDien.put("Xe May","MotorBike");
    }
    @Override
    public String search(String VN) {
        if (tuDien.containsKey(VN)){
            return tuDien.get(VN);
        }else return "Not Found";
    }
}
