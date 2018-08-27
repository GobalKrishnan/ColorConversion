# ColorConversion

<h1 color="green">Formula</h1>
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
<h3> RGB to HSV</h3>
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
  
 <img src="https://www.rapidtables.com/convert/color/rgb-to-hsv/sat-calc.gif">

 

Value calculation:

V = Cmax

   </div>
<hr>
<hr>
<h3> HSV to RGB</h3>
   <div>
     When 0 ≤ H < 360, 0 ≤ S ≤ 1 and 0 ≤ V ≤ 1:

C = V × S

X = C × (1 - |(H / 60°) mod 2 - 1|)

m = V - C

<img src="https://www.rapidtables.com/convert/color/hsv-to-rgb/hsv-to-rgb.gif">


(R,G,B) = ((R'+m)×255, (G'+m)×255,	(B'+m)×255)

   </div>
<hr>
<hr>
<h3> RGB to CMYK</h3>
   <div>
   The R,G,B values are divided by 255 to change the range from 0..255 to 0..1:

R' = R/255

G' = G/255

B' = B/255

The black key (K) color is calculated from the red (R'), green (G') and blue (B') colors:

K = 1-max(R', G', B')

The cyan color (C) is calculated from the red (R') and black (K) colors:

C = (1-R'-K) / (1-K)

The magenta color (M) is calculated from the green (G') and black (K) colors:

M = (1-G'-K) / (1-K)

The yellow color (Y) is calculated from the blue (B') and black (K) colors:

Y = (1-B'-K) / (1-K)
</div>
<hr>
<hr>
<h3> CMYK to RGB</h3>
   <div>
  The R,G,B values are given in the range of 0..255.

The red (R) color is calculated from the cyan (C) and black (K) colors:

R = 255 × (1-C) × (1-K)

The green color (G) is calculated from the magenta (M) and black (K) colors:

G = 255 × (1-M) × (1-K)

The blue color (B) is calculated from the yellow (Y) and black (K) colors:

B = 255 × (1-Y) × (1-K)</div>
<hr>
<hr>






