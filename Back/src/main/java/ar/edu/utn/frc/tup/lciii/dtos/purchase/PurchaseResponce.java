package ar.edu.utn.frc.tup.lciii.dtos.purchase;

import com.mercadopago.resources.preference.Preference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseResponce {
    Preference preference;
}
