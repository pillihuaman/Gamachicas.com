/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.System.BusinessEntity;
import Domain.System.BusinessEntity.Base.*;
/**
 *
 * @author zarmir
 */
public class ViewStockBE{
    
   private  Clothing  Clothing;
   private Color Color;
   private Sizes Sizes;
   private Clothingline Clothingline;

    /**
     * @return the Clothing
     */
    public Clothing getClothing() {
        return Clothing;
    }

    /**
     * @param Clothing the Clothing to set
     */
    public void setClothing(Clothing Clothing) {
        this.Clothing = Clothing;
    }

    /**
     * @return the Color
     */
    public Color getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(Color Color) {
        this.Color = Color;
    }

    /**
     * @return the Sizes
     */
    public Sizes getSizes() {
        return Sizes;
    }

    /**
     * @param Sizes the Sizes to set
     */
    public void setSizes(Sizes Sizes) {
        this.Sizes = Sizes;
    }

    /**
     * @return the Clothingline
     */
    public Clothingline getClothingline() {
        return Clothingline;
    }

    /**
     * @param Clothingline the Clothingline to set
     */
    public void setClothingline(Clothingline Clothingline) {
        this.Clothingline = Clothingline;
    }
    
}
