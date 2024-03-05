package tr.com.mustafacay.interpreter.service.jobexpression;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Context sınıfı, yorumlanacak ifadeyi ve toplam puanı temsil eder
  */
@Getter
@Setter
public class Context {
    private String formula; // İşlem yapılacak formül
    private int totalPoint; // Toplam puan


}
