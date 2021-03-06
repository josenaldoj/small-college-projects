/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maratona2.domain;

/**
 *
 * @author josenaldo
 */
public class Submission extends Entity{
    private int idsubmission;
    private int idreport;
    private int time;
    private int duration;
    private String result;
    private String solution;
    
    public Submission(int id)
    {
        super(id);
    }

    public Submission(int idreport, int time, int duration, String result, String solution) {
        this(-1, idreport, time, duration, result, solution);
    }
    
    public Submission(int idsubmission, int idreport, int time, int duration, String result, String solution) {
        this(idsubmission);
        this.idreport = idreport;
        this.time = time;
        this.duration = duration;
        this.result = result;
        this.solution = solution;
    }

    public int getIdSubmission() {
        return idsubmission;
    }

    public void setIdSubmission(int idsubmission) {
        this.idsubmission = idsubmission;
    }

    public int getIdReport() {
        return idreport;
    }

    public void setIdReport(int idreport) {
        this.idreport = idreport;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
    
    @Override
    public String toString()
    {
        return new StringBuilder()
                .append(idreport)
                .append(": ")
                .append(result)
                .toString();
    }
}
