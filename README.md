# dex-api-java

CET-Lite for CoinEx Chain
- API version: 3.0
  - Build date: 2020-04-27T01:19:45.029Z

A REST interface for state queries, transaction generation and broadcasting.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.coinex</groupId>
  <artifactId>dex-api-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.coinex:dex-api-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dex-api-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.coinex.dex.client.ApiException;import org.coinex.dex.client.model.InlineResponse20048;
import org.coinex.dex.client.api.AliasApi;

public class AliasApiExample {

    public static void main(String[] args) {
        
        AliasApi apiInstance = new AliasApi();
        String alias = "alias_example"; // String | The alias to be queried
        try {
            InlineResponse20048 result = apiInstance.getAddressFromAlias(alias);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AliasApi#getAddressFromAlias");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://dex-api.coinex.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AliasApi* | [**getAddressFromAlias**](docs/AliasApi.md#getAddressFromAlias) | **GET** /alias/address-of-alias/{alias} | Given an alias, query the corresponding address
*AliasApi* | [**getAliasParams**](docs/AliasApi.md#getAliasParams) | **GET** /alias/parameters | Get the current alias parameters
*AliasApi* | [**getAliasesFromAddress**](docs/AliasApi.md#getAliasesFromAddress) | **GET** /alias/aliases-of-address/{address} | Given an account&#39;s address, query all the corresponding aliases
*AliasApi* | [**updateAlias**](docs/AliasApi.md#updateAlias) | **POST** /alias/update | Add or remove alias for an address
*AssetApi* | [**addWhitelist**](docs/AssetApi.md#addWhitelist) | **POST** /asset/tokens/{symbol}/forbidden/whitelist | Add forbid whitelist
*AssetApi* | [**burnToken**](docs/AssetApi.md#burnToken) | **POST** /asset/tokens/{symbol}/burns | Burn token
*AssetApi* | [**forbidAddr**](docs/AssetApi.md#forbidAddr) | **POST** /asset/tokens/{symbol}/forbidden/addresses | Forbid address
*AssetApi* | [**forbidToken**](docs/AssetApi.md#forbidToken) | **POST** /asset/tokens/{symbol}/forbids | Forbid token
*AssetApi* | [**getAssetParams**](docs/AssetApi.md#getAssetParams) | **GET** /asset/parameters | Get the current asset parameters
*AssetApi* | [**getForbiddenAddresses**](docs/AssetApi.md#getForbiddenAddresses) | **GET** /asset/tokens/{symbol}/forbidden/addresses | query forbidden addresses
*AssetApi* | [**getReservedSymbols**](docs/AssetApi.md#getReservedSymbols) | **GET** /asset/tokens/reserved/symbols | List reserved symbols
*AssetApi* | [**getToken**](docs/AssetApi.md#getToken) | **GET** /asset/tokens/{symbol} | queryToken
*AssetApi* | [**getTokenList**](docs/AssetApi.md#getTokenList) | **GET** /asset/tokens | List tokens
*AssetApi* | [**getWhitelist**](docs/AssetApi.md#getWhitelist) | **GET** /asset/tokens/{symbol}/forbidden/whitelist | queryWhitelist
*AssetApi* | [**issueToken**](docs/AssetApi.md#issueToken) | **POST** /asset/tokens | Issue token
*AssetApi* | [**mintToken**](docs/AssetApi.md#mintToken) | **POST** /asset/tokens/{symbol}/mints | Mint token
*AssetApi* | [**modifyTokenInfo**](docs/AssetApi.md#modifyTokenInfo) | **POST** /asset/tokens/{symbol}/infos | Modify token info
*AssetApi* | [**removeWhitelist**](docs/AssetApi.md#removeWhitelist) | **POST** /asset/tokens/{symbol}/unforbidden/whitelist | Remove forbid whitelist
*AssetApi* | [**transferOwnership**](docs/AssetApi.md#transferOwnership) | **POST** /asset/tokens/{symbol}/ownerships | Transfer ownership
*AssetApi* | [**unForbidAddr**](docs/AssetApi.md#unForbidAddr) | **POST** /asset/tokens/{symbol}/unforbidden/addresses | UnForbid address
*AssetApi* | [**unFrobidToken**](docs/AssetApi.md#unFrobidToken) | **POST** /asset/tokens/{symbol}/unforbids | UnForbid token
*AuthApi* | [**getAccount**](docs/AuthApi.md#getAccount) | **GET** /auth/accounts/{address} | Get the account information on blockchain
*AuthApi* | [**getAuthParams**](docs/AuthApi.md#getAuthParams) | **GET** /auth/parameters | Get the current auth parameters
*AuthApi* | [**setReferee**](docs/AuthApi.md#setReferee) | **POST** /auth/accounts/{address}/referee | Set referee for account
*BancorliteApi* | [**bancorCancel**](docs/BancorliteApi.md#bancorCancel) | **POST** /bancorlite/bancor-cancel | cancel bancor
*BancorliteApi* | [**bancorInit**](docs/BancorliteApi.md#bancorInit) | **POST** /bancorlite/bancor-init | create bancor
*BancorliteApi* | [**bancorTrade**](docs/BancorliteApi.md#bancorTrade) | **POST** /bancorlite/bancor-trade | trade with bancor
*BancorliteApi* | [**getBancorInfo**](docs/BancorliteApi.md#getBancorInfo) | **GET** /bancorlite/pools/{symbol} | get the bancor pool info
*BancorliteApi* | [**getBancorInfos**](docs/BancorliteApi.md#getBancorInfos) | **GET** /bancorlite/infos | get all bancor infos
*BancorliteApi* | [**getBancorliteParams**](docs/BancorliteApi.md#getBancorliteParams) | **GET** /bancorlite/parameters | Get the current bancorlite parameters
*BankApi* | [**getAddressBalances**](docs/BankApi.md#getAddressBalances) | **GET** /bank/balances/{address} | Get the account balances
*BankApi* | [**getBankParams**](docs/BankApi.md#getBankParams) | **GET** /bank/parameters | Get the current bankx parameters
*BankApi* | [**sendCoins**](docs/BankApi.md#sendCoins) | **POST** /bank/accounts/{address}/transfers | Send coins from one account to another
*BankApi* | [**setMemoRequired**](docs/BankApi.md#setMemoRequired) | **POST** /bank/accounts/memo | Mark if memo is required to receive coins
*BankApi* | [**transferSupervisedCoins**](docs/BankApi.md#transferSupervisedCoins) | **POST** /bank/accounts/{address}/supervised_transfers | Operate a supervised transfer
*CommentApi* | [**followupComment**](docs/CommentApi.md#followupComment) | **POST** /comment/followup-comment | Post a follow-up comment under some thread
*CommentApi* | [**newThread**](docs/CommentApi.md#newThread) | **POST** /comment/new-thread | Post a new comment to open a new thread
*CommentApi* | [**rewardComments**](docs/CommentApi.md#rewardComments) | **POST** /comment/reward-comments | reward some comments with coins
*DistributionApi* | [**donateToCommunityPool**](docs/DistributionApi.md#donateToCommunityPool) | **POST** /distribution/{accAddress}/donates | Donate to the community pool
*DistributionApi* | [**getAllRewards**](docs/DistributionApi.md#getAllRewards) | **GET** /distribution/delegators/{delegatorAddr}/rewards | Get the total rewards balance from all delegations
*DistributionApi* | [**getCommunityPool**](docs/DistributionApi.md#getCommunityPool) | **GET** /distribution/community_pool | Community pool parameters
*DistributionApi* | [**getDistributionInfo**](docs/DistributionApi.md#getDistributionInfo) | **GET** /distribution/validators/{validatorAddr} | Validator distribution information
*DistributionApi* | [**getDistributionParams**](docs/DistributionApi.md#getDistributionParams) | **GET** /distribution/parameters | Fee distribution parameters
*DistributionApi* | [**getOutstandingRewards**](docs/DistributionApi.md#getOutstandingRewards) | **GET** /distribution/validators/{validatorAddr}/outstanding_rewards | Fee distribution outstanding rewards of a single validator
*DistributionApi* | [**getRewardByValidator**](docs/DistributionApi.md#getRewardByValidator) | **GET** /distribution/delegators/{delegatorAddr}/rewards/{validatorAddr} | Query a delegation reward
*DistributionApi* | [**getValidatorRewards**](docs/DistributionApi.md#getValidatorRewards) | **GET** /distribution/validators/{validatorAddr}/rewards | Commission and self-delegation rewards of a single validator
*DistributionApi* | [**getWithdrawAddress**](docs/DistributionApi.md#getWithdrawAddress) | **GET** /distribution/delegators/{delegatorAddr}/withdraw_address | Get the rewards withdrawal address
*DistributionApi* | [**setWithdrawAddress**](docs/DistributionApi.md#setWithdrawAddress) | **POST** /distribution/delegators/{delegatorAddr}/withdraw_address | Replace the rewards withdrawal address
*DistributionApi* | [**withdrawAllRewards**](docs/DistributionApi.md#withdrawAllRewards) | **POST** /distribution/delegators/{delegatorAddr}/rewards | Withdraw all the delegator&#39;s delegation rewards
*DistributionApi* | [**withdrawAllValidatorRewards**](docs/DistributionApi.md#withdrawAllValidatorRewards) | **POST** /distribution/validators/{validatorAddr}/rewards | Withdraw the validator&#39;s rewards
*DistributionApi* | [**withdrawRewardsByValidator**](docs/DistributionApi.md#withdrawRewardsByValidator) | **POST** /distribution/delegators/{delegatorAddr}/rewards/{validatorAddr} | Withdraw a delegation reward
*GovernanceApi* | [**depositToProposal**](docs/GovernanceApi.md#depositToProposal) | **POST** /gov/proposals/{proposalId}/deposits | Deposit tokens to a proposal
*GovernanceApi* | [**getDepositByAddr**](docs/GovernanceApi.md#getDepositByAddr) | **GET** /gov/proposals/{proposalId}/deposits/{depositor} | Query deposit
*GovernanceApi* | [**getDepositParameters**](docs/GovernanceApi.md#getDepositParameters) | **GET** /gov/parameters/deposit | Query governance deposit parameters
*GovernanceApi* | [**getDeposits**](docs/GovernanceApi.md#getDeposits) | **GET** /gov/proposals/{proposalId}/deposits | Query deposits
*GovernanceApi* | [**getProposalByID**](docs/GovernanceApi.md#getProposalByID) | **GET** /gov/proposals/{proposalId} | Query a proposal
*GovernanceApi* | [**getProposals**](docs/GovernanceApi.md#getProposals) | **GET** /gov/proposals | Query proposals
*GovernanceApi* | [**getProposer**](docs/GovernanceApi.md#getProposer) | **GET** /gov/proposals/{proposalId}/proposer | Query proposer
*GovernanceApi* | [**getTally**](docs/GovernanceApi.md#getTally) | **GET** /gov/proposals/{proposalId}/tally | Get a proposal&#39;s tally result at the current time
*GovernanceApi* | [**getTallyingParameters**](docs/GovernanceApi.md#getTallyingParameters) | **GET** /gov/parameters/tallying | Query governance tally parameters
*GovernanceApi* | [**getVoterByAddr**](docs/GovernanceApi.md#getVoterByAddr) | **GET** /gov/proposals/{proposalId}/votes/{voter} | Query vote
*GovernanceApi* | [**getVoters**](docs/GovernanceApi.md#getVoters) | **GET** /gov/proposals/{proposalId}/votes | Query voters
*GovernanceApi* | [**getVotingParameters**](docs/GovernanceApi.md#getVotingParameters) | **GET** /gov/parameters/voting | Query governance voting parameters
*GovernanceApi* | [**submitCommunityPoolSpendProposal**](docs/GovernanceApi.md#submitCommunityPoolSpendProposal) | **POST** /gov/proposals/community_pool_spend | Generate a community pool spend proposal transaction
*GovernanceApi* | [**submitParameterChangeProposal**](docs/GovernanceApi.md#submitParameterChangeProposal) | **POST** /gov/proposals/param_change | Generate a parameter change proposal transaction
*GovernanceApi* | [**submitProposal**](docs/GovernanceApi.md#submitProposal) | **POST** /gov/proposals | Submit a proposal
*GovernanceApi* | [**voteProposal**](docs/GovernanceApi.md#voteProposal) | **POST** /gov/proposals/{proposalId}/votes | Vote a proposal
*IncentiveApi* | [**getIncentiveParams**](docs/IncentiveApi.md#getIncentiveParams) | **GET** /incentive/parameters | Get the current incentive parameters
*MarketApi* | [**cancelOrder**](docs/MarketApi.md#cancelOrder) | **POST** /market/cancel-order | Cancel the order
*MarketApi* | [**cancelTradingPair**](docs/MarketApi.md#cancelTradingPair) | **POST** /market/cancel-trading-pair | Cancel the trading-pair
*MarketApi* | [**createGteOrder**](docs/MarketApi.md#createGteOrder) | **POST** /market/gte-orders | Create GTE order in blockchain
*MarketApi* | [**createIocOrder**](docs/MarketApi.md#createIocOrder) | **POST** /market/ioc-orders | Create IOC order in blockchain
*MarketApi* | [**createTradingPair**](docs/MarketApi.md#createTradingPair) | **POST** /market/trading-pairs | Create trading-pair in blockchain
*MarketApi* | [**getMarketParams**](docs/MarketApi.md#getMarketParams) | **GET** /market/parameters | Get the current market parameters
*MarketApi* | [**getOrder**](docs/MarketApi.md#getOrder) | **GET** /market/orders/{order-id} | Query order info
*MarketApi* | [**getOrders**](docs/MarketApi.md#getOrders) | **GET** /market/orders/account/{address} | Query user order-id list
*MarketApi* | [**getOrdersInMarket**](docs/MarketApi.md#getOrdersInMarket) | **GET** /market/orderbook/{stock}/{money} | Query trading-pair&#39;s orderbook
*MarketApi* | [**getTradingPair**](docs/MarketApi.md#getTradingPair) | **GET** /market/trading-pairs/{stock}/{money} | Query trading-pair info
*MarketApi* | [**modifyPricePrecision**](docs/MarketApi.md#modifyPricePrecision) | **POST** /market/price-precision | Modify the price precision of the trading pair in the dex
*MarketApi* | [**queryTradingPairs**](docs/MarketApi.md#queryTradingPairs) | **GET** /market/exist-trading-pairs | Query all trading-pair infos in blockchain
*SlashingApi* | [**getSigningInfo**](docs/SlashingApi.md#getSigningInfo) | **GET** /slashing/validators/{validatorPubKey}/signing_info | Get sign info of given validator
*SlashingApi* | [**getSigningInfos**](docs/SlashingApi.md#getSigningInfos) | **GET** /slashing/signing_infos | Get sign info of given all validators
*SlashingApi* | [**getSlashingParams**](docs/SlashingApi.md#getSlashingParams) | **GET** /slashing/parameters | Get the current slashing parameters
*SlashingApi* | [**unjailValidator**](docs/SlashingApi.md#unjailValidator) | **POST** /slashing/validators/{validatorAddr}/unjail | Unjail a jailed validator
*StakingApi* | [**getDelegations**](docs/StakingApi.md#getDelegations) | **GET** /staking/delegators/{delegatorAddr}/delegations | Get all delegations from a delegator
*StakingApi* | [**getDelegationsOfValidator**](docs/StakingApi.md#getDelegationsOfValidator) | **GET** /staking/validators/{validatorAddr}/delegations | Get all delegations from a validator
*StakingApi* | [**getDelegationsToValidator**](docs/StakingApi.md#getDelegationsToValidator) | **GET** /staking/delegators/{delegatorAddr}/delegations/{validatorAddr} | Query the current delegation between a delegator and a validator
*StakingApi* | [**getDelegatorTxs**](docs/StakingApi.md#getDelegatorTxs) | **GET** /staking/delegators/{delegatorAddr}/txs | Get all staking txs (i.e msgs) from a delegator
*StakingApi* | [**getRedelegations**](docs/StakingApi.md#getRedelegations) | **GET** /staking/redelegations | Get all redelegations (filter by query params)
*StakingApi* | [**getStakingParameters**](docs/StakingApi.md#getStakingParameters) | **GET** /staking/parameters | Get the current staking parameter values
*StakingApi* | [**getStakingPool**](docs/StakingApi.md#getStakingPool) | **GET** /staking/pool | Get the current state of the staking pool
*StakingApi* | [**getUndelegationsBetween**](docs/StakingApi.md#getUndelegationsBetween) | **GET** /staking/delegators/{delegatorAddr}/unbonding_delegations/{validatorAddr} | Query all unbonding delegations between a delegator and a validator
*StakingApi* | [**getUndelegationsOfDelegator**](docs/StakingApi.md#getUndelegationsOfDelegator) | **GET** /staking/delegators/{delegatorAddr}/unbonding_delegations | Get all unbonding delegations from a delegator
*StakingApi* | [**getUndelegationsOfValidator**](docs/StakingApi.md#getUndelegationsOfValidator) | **GET** /staking/validators/{validatorAddr}/unbonding_delegations | Get all unbonding delegations from a validator
*StakingApi* | [**getValidator**](docs/StakingApi.md#getValidator) | **GET** /staking/validators/{validatorAddr} | Query the information from a single validator
*StakingApi* | [**getValidatorOfDelegator**](docs/StakingApi.md#getValidatorOfDelegator) | **GET** /staking/delegators/{delegatorAddr}/validators/{validatorAddr} | Query a validator that a delegator is bonded to
*StakingApi* | [**getValidators**](docs/StakingApi.md#getValidators) | **GET** /staking/validators | Get all validator candidates. By default it returns only the bonded validators.
*StakingApi* | [**getValidatorsOfDelegator**](docs/StakingApi.md#getValidatorsOfDelegator) | **GET** /staking/delegators/{delegatorAddr}/validators | Query all validators that a delegator is bonded to
*StakingApi* | [**submitDelegation**](docs/StakingApi.md#submitDelegation) | **POST** /staking/delegators/{delegatorAddr}/delegations | Submit delegation
*StakingApi* | [**submitRedelegation**](docs/StakingApi.md#submitRedelegation) | **POST** /staking/delegators/{delegatorAddr}/redelegations | Submit a redelegation
*StakingApi* | [**undelegate**](docs/StakingApi.md#undelegate) | **POST** /staking/delegators/{delegatorAddr}/unbonding_delegations | Submit an unbonding delegation
*TendermintApi* | [**getBlock**](docs/TendermintApi.md#getBlock) | **GET** /blocks/{height} | Get a block at a certain height
*TendermintApi* | [**getLatestBlock**](docs/TendermintApi.md#getLatestBlock) | **GET** /blocks/latest | Get the latest block
*TendermintApi* | [**getLatestValidatorSet**](docs/TendermintApi.md#getLatestValidatorSet) | **GET** /validatorsets/latest | Get the latest validator set
*TendermintApi* | [**getNodeInfo**](docs/TendermintApi.md#getNodeInfo) | **GET** /node_info | The properties of the connected node
*TendermintApi* | [**getSyncing**](docs/TendermintApi.md#getSyncing) | **GET** /syncing | Syncing state of node
*TendermintApi* | [**getValidatorSet**](docs/TendermintApi.md#getValidatorSet) | **GET** /validatorsets/{height} | Get a validator set a certain height
*TransactionsApi* | [**broadcastTx**](docs/TransactionsApi.md#broadcastTx) | **POST** /txs | Broadcast a signed tx
*TransactionsApi* | [**encodeTx**](docs/TransactionsApi.md#encodeTx) | **POST** /txs/encode | Encode a transaction to the Amino wire format
*TransactionsApi* | [**getTxByHash**](docs/TransactionsApi.md#getTxByHash) | **GET** /txs/{hash} | Get a Tx by hash
*TransactionsApi* | [**searchTx**](docs/TransactionsApi.md#searchTx) | **GET** /txs | Search transactions


## Documentation for Models

 - [Account](docs/Account.md)
 - [Account1](docs/Account1.md)
 - [Addresses](docs/Addresses.md)
 - [AliasUpdateReq](docs/AliasUpdateReq.md)
 - [Amount](docs/Amount.md)
 - [Amount1](docs/Amount1.md)
 - [Amount2](docs/Amount2.md)
 - [BancorCancel](docs/BancorCancel.md)
 - [BancorInfo](docs/BancorInfo.md)
 - [BancorInit](docs/BancorInit.md)
 - [BancorTrade](docs/BancorTrade.md)
 - [BaseMarket](docs/BaseMarket.md)
 - [BaseReq](docs/BaseReq.md)
 - [BaseReq1](docs/BaseReq1.md)
 - [Block](docs/Block.md)
 - [BlockEvidence](docs/BlockEvidence.md)
 - [BlockHeader](docs/BlockHeader.md)
 - [BlockHeaderVersion](docs/BlockHeaderVersion.md)
 - [BlockID](docs/BlockID.md)
 - [BlockIDParts](docs/BlockIDParts.md)
 - [BlockLastCommit](docs/BlockLastCommit.md)
 - [BlockLastCommitPrecommits](docs/BlockLastCommitPrecommits.md)
 - [BlockQuery](docs/BlockQuery.md)
 - [BlockQueryBlockMeta](docs/BlockQueryBlockMeta.md)
 - [BroadcastTxCommitResult](docs/BroadcastTxCommitResult.md)
 - [BroadcastTxCommitResultAttributes](docs/BroadcastTxCommitResultAttributes.md)
 - [BroadcastTxCommitResultEvents](docs/BroadcastTxCommitResultEvents.md)
 - [BroadcastTxCommitResultLogs](docs/BroadcastTxCommitResultLogs.md)
 - [CheckTxResult](docs/CheckTxResult.md)
 - [Coin](docs/Coin.md)
 - [CommentRef](docs/CommentRef.md)
 - [Delegation](docs/Delegation.md)
 - [Delegation1](docs/Delegation1.md)
 - [Delegation2](docs/Delegation2.md)
 - [DelegationDelegatorReward](docs/DelegationDelegatorReward.md)
 - [DelegatorTotalRewards](docs/DelegatorTotalRewards.md)
 - [DeliverTxResult](docs/DeliverTxResult.md)
 - [Deposit](docs/Deposit.md)
 - [FollowupCommentReq](docs/FollowupCommentReq.md)
 - [Info](docs/Info.md)
 - [Info1](docs/Info1.md)
 - [Info2](docs/Info2.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20013Result](docs/InlineResponse20013Result.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20014Result](docs/InlineResponse20014Result.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse20016](docs/InlineResponse20016.md)
 - [InlineResponse20017](docs/InlineResponse20017.md)
 - [InlineResponse20017Result](docs/InlineResponse20017Result.md)
 - [InlineResponse20018](docs/InlineResponse20018.md)
 - [InlineResponse20019](docs/InlineResponse20019.md)
 - [InlineResponse2001Result](docs/InlineResponse2001Result.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse20020](docs/InlineResponse20020.md)
 - [InlineResponse20021](docs/InlineResponse20021.md)
 - [InlineResponse20022](docs/InlineResponse20022.md)
 - [InlineResponse20023](docs/InlineResponse20023.md)
 - [InlineResponse20024](docs/InlineResponse20024.md)
 - [InlineResponse20025](docs/InlineResponse20025.md)
 - [InlineResponse20026](docs/InlineResponse20026.md)
 - [InlineResponse20026Result](docs/InlineResponse20026Result.md)
 - [InlineResponse20027](docs/InlineResponse20027.md)
 - [InlineResponse20027Result](docs/InlineResponse20027Result.md)
 - [InlineResponse20028](docs/InlineResponse20028.md)
 - [InlineResponse20028Result](docs/InlineResponse20028Result.md)
 - [InlineResponse20029](docs/InlineResponse20029.md)
 - [InlineResponse2002Result](docs/InlineResponse2002Result.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse20030](docs/InlineResponse20030.md)
 - [InlineResponse20031](docs/InlineResponse20031.md)
 - [InlineResponse20032](docs/InlineResponse20032.md)
 - [InlineResponse20033](docs/InlineResponse20033.md)
 - [InlineResponse20033Result](docs/InlineResponse20033Result.md)
 - [InlineResponse20034](docs/InlineResponse20034.md)
 - [InlineResponse20034Result](docs/InlineResponse20034Result.md)
 - [InlineResponse20035](docs/InlineResponse20035.md)
 - [InlineResponse20035Result](docs/InlineResponse20035Result.md)
 - [InlineResponse20036](docs/InlineResponse20036.md)
 - [InlineResponse20036Result](docs/InlineResponse20036Result.md)
 - [InlineResponse20036ResultPlans](docs/InlineResponse20036ResultPlans.md)
 - [InlineResponse20037](docs/InlineResponse20037.md)
 - [InlineResponse20037Result](docs/InlineResponse20037Result.md)
 - [InlineResponse20038](docs/InlineResponse20038.md)
 - [InlineResponse20039](docs/InlineResponse20039.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse20040](docs/InlineResponse20040.md)
 - [InlineResponse20041](docs/InlineResponse20041.md)
 - [InlineResponse20042](docs/InlineResponse20042.md)
 - [InlineResponse20042Result](docs/InlineResponse20042Result.md)
 - [InlineResponse20043](docs/InlineResponse20043.md)
 - [InlineResponse20044](docs/InlineResponse20044.md)
 - [InlineResponse20045](docs/InlineResponse20045.md)
 - [InlineResponse20046](docs/InlineResponse20046.md)
 - [InlineResponse20046Result](docs/InlineResponse20046Result.md)
 - [InlineResponse20047](docs/InlineResponse20047.md)
 - [InlineResponse20048](docs/InlineResponse20048.md)
 - [InlineResponse20049](docs/InlineResponse20049.md)
 - [InlineResponse2004Result](docs/InlineResponse2004Result.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse20050](docs/InlineResponse20050.md)
 - [InlineResponse20050Result](docs/InlineResponse20050Result.md)
 - [InlineResponse20051](docs/InlineResponse20051.md)
 - [InlineResponse20051Result](docs/InlineResponse20051Result.md)
 - [InlineResponse20052](docs/InlineResponse20052.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [InlineResponse200ApplicationVersion](docs/InlineResponse200ApplicationVersion.md)
 - [InlineResponse200NodeInfo](docs/InlineResponse200NodeInfo.md)
 - [InlineResponse200NodeInfoOther](docs/InlineResponse200NodeInfoOther.md)
 - [InlineResponse200NodeInfoProtocolVersion](docs/InlineResponse200NodeInfoProtocolVersion.md)
 - [IssueToken](docs/IssueToken.md)
 - [KVPair](docs/KVPair.md)
 - [KeyOutput](docs/KeyOutput.md)
 - [LockedCoin](docs/LockedCoin.md)
 - [MarketInfo](docs/MarketInfo.md)
 - [MarketInfos](docs/MarketInfos.md)
 - [Msg](docs/Msg.md)
 - [NewOwner](docs/NewOwner.md)
 - [NewThreadReq](docs/NewThreadReq.md)
 - [Order](docs/Order.md)
 - [OrderIds](docs/OrderIds.md)
 - [OrderInfo](docs/OrderInfo.md)
 - [PaginatedQueryTxs](docs/PaginatedQueryTxs.md)
 - [ParamChange](docs/ParamChange.md)
 - [PostDepositBody](docs/PostDepositBody.md)
 - [PostProposalBody](docs/PostProposalBody.md)
 - [PostProposalBody1](docs/PostProposalBody1.md)
 - [PostProposalBody2](docs/PostProposalBody2.md)
 - [PostTxBody](docs/PostTxBody.md)
 - [PostVoteBody](docs/PostVoteBody.md)
 - [Proposer](docs/Proposer.md)
 - [PublicKey](docs/PublicKey.md)
 - [Redelegation](docs/Redelegation.md)
 - [RedelegationEntry](docs/RedelegationEntry.md)
 - [Referee](docs/Referee.md)
 - [RewardCommentsReq](docs/RewardCommentsReq.md)
 - [SigningInfo](docs/SigningInfo.md)
 - [StdTx](docs/StdTx.md)
 - [StdTxCore](docs/StdTxCore.md)
 - [StdTxCoreFee](docs/StdTxCoreFee.md)
 - [StdTxCorePubKey](docs/StdTxCorePubKey.md)
 - [StdTxCoreSignatures](docs/StdTxCoreSignatures.md)
 - [Supply](docs/Supply.md)
 - [TallyResult](docs/TallyResult.md)
 - [TendermintValidator](docs/TendermintValidator.md)
 - [TextProposal](docs/TextProposal.md)
 - [TextProposalContent](docs/TextProposalContent.md)
 - [TextProposalContentValue](docs/TextProposalContentValue.md)
 - [Token](docs/Token.md)
 - [TokenValue](docs/TokenValue.md)
 - [Tx](docs/Tx.md)
 - [TxBroadcast](docs/TxBroadcast.md)
 - [TxQuery](docs/TxQuery.md)
 - [TxQueryResult](docs/TxQueryResult.md)
 - [UnbondingDelegationPair](docs/UnbondingDelegationPair.md)
 - [UnbondingEntries](docs/UnbondingEntries.md)
 - [UnjailBody](docs/UnjailBody.md)
 - [Validator](docs/Validator.md)
 - [ValidatorCommission](docs/ValidatorCommission.md)
 - [ValidatorCommissionCommissionRates](docs/ValidatorCommissionCommissionRates.md)
 - [ValidatorDescription](docs/ValidatorDescription.md)
 - [ValidatorDistInfo](docs/ValidatorDistInfo.md)
 - [Vote](docs/Vote.md)
 - [Whitelist](docs/Whitelist.md)
 - [WithdrawRequestBody](docs/WithdrawRequestBody.md)
 - [WithdrawRequestBody1](docs/WithdrawRequestBody1.md)
 - [WithdrawRequestBody2](docs/WithdrawRequestBody2.md)
 - [WithdrawRequestBody3](docs/WithdrawRequestBody3.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### kms

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



