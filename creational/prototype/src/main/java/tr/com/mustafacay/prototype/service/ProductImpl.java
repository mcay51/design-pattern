package tr.com.mustafacay.prototype.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class ProductImpl implements Product{
    private int productId;
    private String producName;
    @Setter
    private  double listPrice;
    @Setter
    private Color color;

    @Override
    public Object clone() {
       //Product sınıfının klonu oluşturuluyor
        ProductImpl product= null;
        try {
            product = (ProductImpl) super.clone();
            //Product içerisinde yer alan Color sınıfının klonu oluşturuluyor
            Color colorClone = (Color) color.clone();
            product.setColor(colorClone);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return  product;
    }
}
