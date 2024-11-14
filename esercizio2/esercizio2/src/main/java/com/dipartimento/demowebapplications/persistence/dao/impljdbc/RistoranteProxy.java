package com.dipartimento.demowebapplications.persistence.dao.impljdbc;

import com.dipartimento.demowebapplications.model.Piatto;
import com.dipartimento.demowebapplications.model.Ristorante;
import com.dipartimento.demowebapplications.persistence.DBManager;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class RistoranteProxy extends Ristorante {
    private List<Piatto> piatti;

    @Override
    public List<Piatto> getPiatti() {
        if (this.piatti == null) {
            try {
                this.piatti = DBManager.getInstance().getPiattoDao().findAllByRistoranteName(this.nome);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return piatti;
    }
}
