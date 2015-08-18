<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:mlo="http://ws.cdyne.com/WeatherWS/">

	<!-- output each weather node, as a single text description -->
	<xsl:output method="text" version="1.0" encoding="UTF-8" indent="no"/>
	<xsl:template match="//mlo:GetWeatherInformationResult">
		<xsl:for-each select="//mlo:WeatherDescription">
		<xsl:value-of select="mlo:WeatherID"/><xsl:text>-</xsl:text>
			<xsl:value-of select="mlo:Description"/>
			<xsl:text>&#10;</xsl:text>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>
