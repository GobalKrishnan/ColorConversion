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

   <img src="https://www.rapidtables.com/convert/color/rgb-to-hsv/hue-calc2.gif">

 

Saturation calculation:

   <img src="https://www.rapidtables.com/convert/color/rgb-to-hsl/sat-calc.gif">

 

Lightness calculation:

L = (Cmax + Cmin) / 2
  
   </div>
<hr>
<hr>
<h3> HSL to RGB</h3>
   <div>
  
 When 0 ≤ H < 360, 0 ≤ S ≤ 1 and 0 ≤ L ≤ 1:

C = (1 - |2L - 1|) × S

X = C × (1 - |(H / 60°) mod 2 - 1|)

m = L - C/2

<img src="https://www.rapidtables.com/convert/color/hsv-to-rgb/hsv-to-rgb.gif">


(R,G,B) = ((R'+m)×255, (G'+m)×255,(B'+m)×255)
   </div>
<hr>
<hr>





