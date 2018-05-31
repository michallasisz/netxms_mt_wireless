sub oid2mac(o)
{
	splitted = SplitString(o, ".");
	mac = "";
	for (i=0; i<6; i++)
	{
		decoded =d2x(splitted[i]);
		if (length(decoded) == 1)
		{
			decoded = "0".decoded;
		}
		if (i !=5)
		{
			mac = mac.decoded.":";
		}
		else
		{
		mac = mac.decoded;
		}
	}
	return mac;
}
m = oid2mac($1);
if (m == null)
	return false;
return %(true, $1, m);
