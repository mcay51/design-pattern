package tr.com.mustafacay.prototype.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Color implements Cloneable{

    private String colorName;

   @Override
    public Object clone()  {
       try {
           return (Color) super.clone();
       } catch (CloneNotSupportedException e) {
           throw new RuntimeException(e);
       }
   }
}
