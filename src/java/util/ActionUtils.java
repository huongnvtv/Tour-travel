/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ADMIN
 */
public class ActionUtils {
    protected boolean isAdd;
    protected boolean isEdit;
    protected boolean isCopy;
    protected boolean isView;
    public ActionUtils(){
        isAdd=false;
        isCopy=false;
        isView=false;
        isEdit=false;
    }
    public void changeStateAdd(){
        isAdd=true;
        isCopy=false;
        isView=false;
        isEdit=false;
        
    }
    public void changeStateEdit(){
        isAdd=false;
        isCopy=false;
        isView=false;
        isEdit=true;
    }
    public void changeStateCopy(){
        isAdd=false;
        isCopy=true;
        isView=false;
        isEdit=false;
    }
    public void changeStateView(){
        isAdd=false;
        isCopy=false;
        isView=true;
        isEdit=false;
    }
    public boolean disPlayMain(){
        if(!isAdd && !isEdit &&!isCopy &&!isView ){
            return true;
        }else{
            return false;
        }
    }
    public void handCancel(){
        isAdd=false;
        isCopy=false;
        isView=false;
        isEdit=false;
    }

    public boolean isIsAdd() {
        return isAdd;
    }

    public void setIsAdd(boolean isAdd) {
        this.isAdd = isAdd;
    }

    public boolean isIsEdit() {
        return isEdit;
    }

    public void setIsEdit(boolean isEdit) {
        this.isEdit = isEdit;
    }

    public boolean isIsCopy() {
        return isCopy;
    }

    public void setIsCopy(boolean isCopy) {
        this.isCopy = isCopy;
    }

    public boolean isIsView() {
        return isView;
    }

    public void setIsView(boolean isView) {
        this.isView = isView;
    }
    
}
