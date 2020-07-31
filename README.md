# Introduction of simple-dbmeter
 a simple dbmeter to test Kafka, mirrormaker, Azure Event Hub and Stream Analytics Job

# Overall architecture
<p><img src="./resources/simple-dbmeter-intro.png" alt="components of the solution" /> </p>

# HW & Service **Costs**

<div class=WordSection1>

<table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0 width=642
 style='width:481.7pt;border-collapse:collapse;border:none'>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Component</span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-left:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>OTC
  (RMB/USD)</span></p>
  </td>
  <td width=155 valign=top style='width:116.45pt;border:solid windowtext 1.0pt;
  border-left:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>MRC
  (RMB/USB)</span></p>
  </td>
  <td width=247 valign=top style='width:185.05pt;border:solid windowtext 1.0pt;
  border-left:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Comments</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><img
  width=77 height=68 id="Picture 1" src="./resources/dbsensor.jpeg"
  alt="A picture containing engine&#10;&#10;Description automatically generated"></span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>240
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>34
  USD</span></p>
  </td>
  <td width=155 valign=top style='width:116.45pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=247 valign=top style='width:185.05pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Bought
  from Taobao.com</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><img
  width=70 height=70 id="Picture 2" src="./resources/RS485-USB-convertor.jpeg"
  alt="A close up of a device&#10;&#10;Description automatically generated"></span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>35
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>5
  USD</span></p>
  </td>
  <td width=155 valign=top style='width:116.45pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=247 valign=top style='width:185.05pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Bought
  from Taobao.com</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><img
  width=70 height=70 id="Picture 3" src="./resources/poweradapter.jpeg"
  alt="A close up of a device&#10;&#10;Description automatically generated"></span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>34
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>5
  USD</span></p>
  </td>
  <td width=155 valign=top style='width:116.45pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=247 valign=top style='width:185.05pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Bought
  from Taobao.com</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
  <td width=155 valign=top style='width:116.45pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
  <td width=247 valign=top style='width:185.05pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
 </tr>
</table>

<p class=MsoNormal><span lang=EN-US>&nbsp;</span></p>

</div>


# Setup & Test

# other comments 