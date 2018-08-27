# ColorConversion

<h1>Formula</h1>
<h3> RGB to HSL</h3>
   <div>
  
  The R,G,B values are divided by 255 to change the range from 0..255 to 0..1:

R' = R/255

G' = G/255

B' = B/255

Cmax = max(R', G', B')

Cmin = min(R', G', B')

Δ = Cmax - Cmin

 

Hue calculation:



 

Saturation calculation:



 

Lightness calculation:

L = (Cmax + Cmin) / 2
  
   </div>
