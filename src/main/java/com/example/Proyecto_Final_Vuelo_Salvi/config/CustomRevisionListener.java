package com.example.Proyecto_Final_Vuelo_Salvi.config;

import com.example.Proyecto_Final_Vuelo_Salvi.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }
}
