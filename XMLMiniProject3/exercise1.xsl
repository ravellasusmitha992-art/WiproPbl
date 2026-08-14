<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <head>
    <style>
      table { border-collapse: collapse; font-family: Arial; margin-top: 10px; }
      th, td { border: 1px solid black; padding: 6px; text-align: left; font-size: 14px; }
      th { background-color: #FFC0CB; color: #800000; } /* Header Style */
    </style>
  </head>
  <body>
    <h3>Flower Depot</h3>
    <table>
      <tr>
        <th>Flower Name</th><th>Color</th><th>Price</th><th>Availability</th>
      </tr>
      <xsl:for-each select="FlowerDepot/Flower">
      <tr>
        <td><xsl:value-of select="Name"/></td>
        <td><xsl:value-of select="Color"/></td>
        <td><xsl:value-of select="Price"/></td>
        <td><xsl:value-of select="Availability"/></td>
      </tr>
      </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>