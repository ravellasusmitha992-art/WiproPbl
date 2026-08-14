<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <head>
    <style>
      table { border-collapse: collapse; width: 90%; margin: 20px auto; font-family: Arial; }
      th { background-color: #00B0F0; color: black; border: 1px solid #555; padding: 8px; }
      td { border: 1px solid #555; padding: 8px; text-align: left; }
      h2 { text-align: center; }
      .high-sales { background-color: red; color: black; font-weight: bold; }
    </style>
  </head>
  <body>
    <h2>Mobile Phone Sales Summary</h2>
    <table>
      <tr>
        <th>ModelID</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Color</th>
        <th>SIM Size</th>
        <th>Memory</th>
        <th>Camera</th>
        <th>Touch Screen</th>
        <th>Number Sold</th>
        <th>Store Name</th>
      </tr>
      <xsl:for-each select="MobileSales/Mobile">
      <tr>
        <td><xsl:value-of select="ModelID"/></td>
        <td><xsl:value-of select="Brand"/></td>
        <td><xsl:value-of select="Price"/></td>
        <td><xsl:value-of select="Color"/></td>
        <td><xsl:value-of select="SIMSize"/></td>
        <td><xsl:value-of select="Memory"/></td>
        <td><xsl:value-of select="Camera"/></td>
        <td><xsl:value-of select="TouchScreen"/></td>
        
        <!-- Conditional Formatting for NoSold > 10 -->
        <td class="{if (NoSold &gt; 10) then 'high-sales' else ''}">
            <xsl:choose>
                <xsl:when test="NoSold &gt; 10">
                    <xsl:attribute name="style">background-color:red;</xsl:attribute>
                </xsl:when>
            </xsl:choose>
            <xsl:value-of select="NoSold"/>
        </td>
        
        <td><xsl:value-of select="storeName"/></td>
      </tr>
      </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>