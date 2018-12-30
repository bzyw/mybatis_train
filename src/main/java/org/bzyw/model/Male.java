package org.bzyw.model;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("male")
public class Male extends User {
    private static final long serialVersionUID = -724211057573637249L;
    private List<MaleExamination> examinations;

    public List<MaleExamination> getExaminations() {
        return examinations;
    }

    public void setExaminations(List<MaleExamination> examinations) {
        this.examinations = examinations;
    }
}
