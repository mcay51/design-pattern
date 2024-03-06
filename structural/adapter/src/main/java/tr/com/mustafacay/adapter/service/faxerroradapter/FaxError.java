package tr.com.mustafacay.adapter.service.faxerroradapter;

import lombok.Getter;

/**
 * FaxError sınıfı, fax hatalarını temsil eder
  */
@Getter
public class FaxError {
    private int faxErrorCode;
    private String faxErrorMessage;

    // Constructor, fax hata kodu ve mesajını alır
    public FaxError(int faxErrorCode, String faxErrorMessage) {
        this.faxErrorCode = faxErrorCode;
        this.faxErrorMessage = faxErrorMessage;
    }
}

