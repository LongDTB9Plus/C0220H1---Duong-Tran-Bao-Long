package services.impl;

import org.springframework.stereotype.Service;
import services.ChuyenDoi;
@Service
public class ChuyenDoiImpl implements ChuyenDoi {
    @Override
    public double quyDoi(double usd) {
        return usd*tiGia;
    }
}
