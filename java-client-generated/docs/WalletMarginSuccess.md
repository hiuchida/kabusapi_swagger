# WalletMarginSuccess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marginAccountWallet** | **Double** | 信用新規可能額 |  [optional]
**depositkeepRate** | **Double** | 保証金維持率&lt;br&gt;※銘柄指定の場合のみ&lt;br&gt;※銘柄が指定されなかった場合、0.0を返す。 |  [optional]
**consignmentDepositRate** | **Double** | 委託保証金率&lt;br&gt;※銘柄指定の場合のみ。&lt;br&gt;※銘柄が指定されなかった場合、Noneを返す。 |  [optional]
**cashOfConsignmentDepositRate** | **Double** | 現金委託保証金率&lt;br&gt;※銘柄指定の場合のみ。&lt;br&gt;※銘柄が指定されなかった場合、Noneを返す。 |  [optional]
**maximumSellOpenAmountPerSymbol** | **Double** | 銘柄あたり建玉可能額（売）&lt;br&gt;※銘柄指定の場合のみ。&lt;br&gt;※銘柄あたり建玉上限対象外の場合、nullを返す。 |  [optional]
**maximumBuyOpenAmountPerSymbol** | **Double** | 銘柄あたり建玉可能額（買）&lt;br&gt;※銘柄指定の場合のみ。&lt;br&gt;※銘柄あたり建玉上限対象外の場合、nullを返す。 |  [optional]
