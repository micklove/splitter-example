<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:mlo="http://ws.cdyne.com/WeatherWS/">

	<!-- output each weather node, as a single text description -->
	<xsl:output method="text" version="1.0" encoding="UTF-8" indent="no"/>

	<xsl:template match="/mlo:WeatherDescription">
		<xsl:value-of select="mlo:WeatherID"/><xsl:text>-</xsl:text>
			<xsl:value-of select="mlo:Description"/>
	</xsl:template>
</xsl:stylesheet>


<!--
Example input

<WeatherDescription xmlns="http://ws.cdyne.com/WeatherWS/">
  <WeatherID>36</WeatherID>
  <Description>Unknown Precipitation</Description>
  <PictureURL>http://ws.cdyne.com/WeatherWS/Images/na.gif</PictureURL>
</WeatherDescription>

Example output
Unknown Precipitation

-->
