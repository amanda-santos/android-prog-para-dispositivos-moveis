package com.example.navegacaoactivities;

import android.os.Parcel;
import android.os.Parcelable;

public class Disciplina implements Parcelable {
    private String disciplina;
    private String professor;
    private String curso;

    protected Disciplina(Parcel in) {
        this.disciplina = in.readString();
        this.professor = in.readString();
        this.curso = in.readString();
    }

    public Disciplina() {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(disciplina);
        dest.writeString(professor);
        dest.writeString(curso);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static final Creator<Disciplina> CREATOR = new Creator<Disciplina>() {
        @Override
        public Disciplina createFromParcel(Parcel in) {
            return new Disciplina(in);
        }

        @Override
        public Disciplina[] newArray(int size) {
            return new Disciplina[size];
        }
    };

    public int describeContents() {
        return hashCode();
    }
}
