package com.taylorthurman.playground.adventofcode.christmas2022;

import java.util.HashMap;
import java.util.Map;

public class Day3RuckSackReorganization {

    public static void main(String[] args) {
        String[] rucksacks = input.split("\\R");
        part1(rucksacks);
        part2(rucksacks);
    }

    private static void part1(String[] rucksacks) {
        Map<String, Integer> priority = new HashMap<>();
        int lower = 97;
        int upper = 65;
        for (int i = 0; i < 26; i++) {
            priority.put(Character.toString((char) (lower + i)), i + 1);
        }
        for (int i = 0; i < 26; i++) {
            priority.put(Character.toString((char) (upper + i)), i + 1 + 26);
        }

        int total = 0;
        for (String sack : rucksacks) {
            String comp1 = sack.substring(0, (sack.length() / 2));
            String comp2 = sack.substring(sack.length() / 2);

            outer:
            for (Character one : comp1.toCharArray()) {
                for (Character two : comp2.toCharArray()) {
                    if (one.equals(two)) {
                        total += priority.get(one.toString());
                        break outer;
                    }
                }
            }
        }

        System.out.println(total);
    }

    private static void part2(String[] rucksacks) {

    }

    private static final String input = "PPZTzDhJPLqPhqDTqrwQZZWbmCBMJMcsNmCBFWmMcsNb\n" +
            "vplSlfdfGvfRRGsgNcMglsFWMWMC\n" +
            "jtjvFHdjjwqrwqwL\n" +
            "NSffhsNSjfLjfstsjtjNNjjqMqnpggHngqgHGHCgClGbCzCC\n" +
            "dDPZZDZFdwFWwFZFWZRTFDwGzCMlgnpgCpnzglClHMbg\n" +
            "DTPFZQRcdTVNhbjVbcLc\n" +
            "JZLDcSZSpHHrrLrJcpzBRrhlzgRTmTmvBRmm\n" +
            "qQsQMCbMQWqCVVvmTRhTTRhCRhTg\n" +
            "svbGWPqGPNLJSpZnZpnN\n" +
            "wLtPGCLwfWLflCPtPfLLTSbHMbSgMdtvDHghhHvdgZ\n" +
            "nNsFznJcJqzFFszFqrNnRzdbZDDbRMbMdRHbMdgHvZSd\n" +
            "VczNnjsrFrjcNprqVwTPfjGllWPQBBWlgB\n" +
            "nnGtjFFjFTTTGtBGmWBTWffLcMJMQlzjQPCPcChCQDJzDJJd\n" +
            "SSggbHVbZRgZsHZRHdVhzCcJhzhMzJhQPQ\n" +
            "rHsNSsSZqqrNgpLLWmCfFGqGCBWm\n" +
            "ZnCtCCVZmVBCQBWQnWQNCQMcLrMMgMLqLSwMSSDwjcBD\n" +
            "hTbGJGfTbrSfScmjwj\n" +
            "bbGGlTdlJTdGlFpdFvJdsbmdZWPWtnVCHQvtVHzvtHWtCtVN\n" +
            "pNpCNFMNFhhwDgRVdSVqwgrdmJ\n" +
            "nvHbPZtTHWbntTmdTRrqVRrdmz\n" +
            "vHWPBWvntbWnHLHZLqWtBCjjhBNhCjGjjNjDNChlFC\n" +
            "CnFbFzpzJbsCRpbRpbnPCnJLTtwQtjdtcttHHHDtDPjQwTHB\n" +
            "qGrflmrNgvvmGqcdwrtWQHwTBHQWtj\n" +
            "mVMvSclGqvNVMMNVsZsnJJRJsbzpSJpJ\n" +
            "cJTcRllRldjZlFcbcFJrrvqCCVTNNVWSPpQNmpQqCPVC\n" +
            "wGLBfLzgBfzHGGGnLDGDGgwHqqHmVSWqpQpCpQRWVWVNpS\n" +
            "DRshRBLMhZlFZMJvlJ\n" +
            "SdGbmRGddMcfbWWSptssDHssGDNsjCCC\n" +
            "glPLTzczrCpNNsHTst\n" +
            "gqcZJPrBlhJgPndMVJbWMVfnWV\n" +
            "qNbmLmndBQqjsCPLZsLPZz\n" +
            "pwfhfCvJvvTMGzSjzPSPjcZp\n" +
            "VvvJVMCrvTRwgvwWvqNmqblNHtBWqQWlql\n" +
            "WNJmddmpFmMMrnlFddlWTHCHBRcnCBTRzTDRTwTz\n" +
            "qffLvLLvbqhqPbjbqRGPSqVtPDTTwTwTDzCBCccQczssCwcc\n" +
            "tfhGLhqthZVhbfpFRJMMMrJrZpmZ\n" +
            "VVgSmdqFpMddqSfpfVVWQvzTPvTWPrpsQPQQJv\n" +
            "ZCnRCDwRWCPrTrsW\n" +
            "HwRNLLsnHRNjtRSqNqMmfqVVMbqg\n" +
            "slqwzGvWqMsvbmTzTCBhhBhgcgjbCPCchc\n" +
            "tJVJSZStQdMQSdntJHjFNFPCNpjFCPcFFdhB\n" +
            "QDrRVZSnrQDVVRRtRHHWGmzTDDqMqMfzwswWsl\n" +
            "rFBrJFcrWHzCLFHqSg\n" +
            "PdVjfjlGPRzRGtGLRC\n" +
            "TQPMpMVPDDPfPTMMPpTWWrhbcbTcWbzzcsmTmb\n" +
            "ZDQDZDJNqqNbwQPgtlGntHlVGlPPrf\n" +
            "vhmChcgvMCdvzCvvHfdntBHGBldrHBVG\n" +
            "cCpTCLvmjhpjzSTTLSpwbDqjJQFZgNDwJssFDw\n" +
            "LfMFLwMwdrFmWBJD\n" +
            "tVlHqqVTHRtmQggrjQqDJg\n" +
            "VDntHnDGRntHPbLPPLLZhcsLPLww\n" +
            "FBLddLctDQcbCLltbdCRdLQVNVDjnPHVnsjnPqVSHNNVTP\n" +
            "vGmwrZZWJpfWfmvZgZJjSTPqsTrVPTrHTssNPP\n" +
            "wNZJffhNWmhvMhgwMZpvNJtbQRtQQLdFhbQFClLBCBlc\n" +
            "npvSWJBCDDBBDSvCZSpJdsTZsRhTdgMgPdhqHHqR\n" +
            "bjtwqLrtmfmtLVjVLQHHHdgwTTHMssMTGHhH\n" +
            "VtmVVNtqlllpJvnnnS\n" +
            "nCqrnLSSGnpjBjBGbcbPbB\n" +
            "vfdVdtdgMMrFgHfHPcBcPBjwQDjFbwDB\n" +
            "zgHWMmgHmWfWvVvRRzLCSCJsZNpJZSsrnssW\n" +
            "bBjWlfrrnClSssMMFmVVhMjgMpLM\n" +
            "dRDqDdzQrDdhqMMPtVLgFL\n" +
            "THDRwHDNDdQdcDvTcZbBGBGrZZnZcrlb\n" +
            "jgSVPVsVmshhsCQm\n" +
            "vmFtcDBfDFLrvTFZvLFvWzWhHwCWHnwHnCQCcwnq\n" +
            "FmDpFBmZZFrDbDfDtmLNgMPNGdPjRdPlPPpMVN\n" +
            "VVJGdSHZnnHdgFntcschhccvvPvtstPq\n" +
            "mLNjNQFBpPlPvNqs\n" +
            "LMTMMRDwwMMSGZzRnnGbzF\n" +
            "JFFfVrvVmHfGmHFvmrSQBQlSJLlShLlgBqwJ\n" +
            "DMCdpCbtgbcCCNpbCCPgRqdldBRQRBRwLsBSLhQs\n" +
            "cgbcPbpcWDWjNCZDWWZttDDGrHzznHzjGzmHnVjVvvVnrz\n" +
            "rtGTmSTGNtvvgfNGSbfwWWvJqwcDwwJPWcwWqD\n" +
            "lZhdHzFhLZhdBcWsWsWmwPcFqW\n" +
            "BhhjLzhZCCdhgCTtCSMmMrbt\n" +
            "FrzSRNrWNFdNhcRDDdrFWCVVZZZmjJbJSPlllgllVbgT\n" +
            "nQGGHqvHMVVpMLGffqtwLMtwlmPbTbjZPJmllLJBmZmZlZbP\n" +
            "VMvvpvQttHqnsvhhzhdrcdWNchsW\n" +
            "BzRTBbWVQNdngtDFVprDFrpF\n" +
            "vhfhSJvbhwSpDDFZHfMpHp\n" +
            "JhmvJsLLJLJqmsJLbsGGjvNRzzBcTBNlRNmnRTQdzzzn\n" +
            "vpCLrTcpRmncrncLcnccvLLNWVsRbhbtsQbJbVQWtWlWbW\n" +
            "PfFfdjdSjPffMFsQbNhlFssFNQ\n" +
            "zBDsjgfZHczLHTHC\n" +
            "BnvpJnVgPWJzczpnvnWVWRGTrRTGmmBhRmBmThrmrf\n" +
            "dNlwjLNLlbLSjLQVdLdjjSTRHmRmTTNmmRRtfTTfhThs\n" +
            "FSSSqbVDQZzzPPPFZc\n" +
            "fTTrrBqwfDTWfTDrRNrnRjgPSpJPnnmp\n" +
            "PvHPbsvZlMtbbvbCLLMHtHZZjtgJRjSnJSpSpjRgRjggSRmn\n" +
            "VLHbCbVPLZvlvMhHCHlPHbLCqQQfdQTBddTWhDTBchQzQwBW\n" +
            "ZBHHfHWLfLqjfLjHZBSDwHDWhvpFCQqNpvVNVNQCFPJvPQCF\n" +
            "zMrtclbdvFPSpdFp\n" +
            "rGMMnnGgsbzblRnlSrzSgRRDwLWjLjTTDBZmfLwZmDBf\n" +
            "rfJVfnztTfZFMfZq\n" +
            "cRGcdddPRbHvHCRHRmShqFrPSTmTPjSjZT\n" +
            "NvRHGGdNLrNJsDtL\n" +
            "dgggppRqnlnjbbjRwzmtHb\n" +
            "ZTPhrVvMZhrVQPZNCMZQjjbFtjmswwFtzVmLGbmL\n" +
            "rZhPCPPcNPNTMfvZPCvhMPSBpgSqSqfpDgJJggdwWJgg\n" +
            "TsgFbTQSZZsSJFThhggQFshpMSzRRRDPwwzPwDftRDrczLww\n" +
            "GCmnjCNjmlVdHNfdGNjMwPrrLwLcMcrcRHzMHM\n" +
            "nmmBnmlWlVWvjnNlpfFQbZsFpQhgJFpB\n" +
            "jfpdTTqqJpDfQrscgsDh\n" +
            "mNFmHHtVsVQrsllG\n" +
            "CmFtZPHNzzpBspzpLBqw\n" +
            "RsgJsjsZbTjmZZMMJPtCSPPDhCSrDhrjhC\n" +
            "lBwzHLQddZlLQnChGdtDhrnqhq\n" +
            "fLHpNQQpwvHllQVQHNNfHpzZMFWbccmTcbJMcFsWTRVbsTWF\n" +
            "DhHFMRDDmLmshTmSCpSWZVNHtCCNnW\n" +
            "fJJPBvlvlBflQQfQtNWtQzpSWZNtCZpN\n" +
            "vPJbdvBfqhqhShTFMs\n" +
            "lttWShphLtWWGppCQLlwZTHZHmfjjvwvHFmw\n" +
            "MFNssMMDVzrrnTmvJTHwJmZmZr\n" +
            "MsBznNznRgzzncFBLQQGGBBtdhdGpWPp\n" +
            "JFmvMWBmBlbBCZrZrH\n" +
            "DjRRjgffgjqwsDqrcHNNbCZbCbbN\n" +
            "sSffwRVjjDVzfjSjswDSQLdPrvGvFMmMJMMJmnWzGL\n" +
            "RbvwgbTVgzGTrhvWDmNDGJfCDffMmNBD\n" +
            "PjSlqldccqFLSqQLCpJfpWDCcCJZBpMD\n" +
            "jlHdPlqqSnjHggWgwrhzRz\n" +
            "WsJnWnmCJpTnLWmJLCSDVVmhNjRbrDRgrgZRhrjrhhgdZN\n" +
            "QlFfQBqlBwBqBffMFPsbgdgwsrZjrPNrNs\n" +
            "MvvvlHBcfBtvffGBcMqqqLpmLsJtpSLSCWCVCnnTzJ\n" +
            "QSRRwSWPhWhwwHbtsNGZNRNZTgRcmc\n" +
            "nfvDCrnnDvJJDDVMLNgtsZmZsVtZGgqmGp\n" +
            "nCngDlFfvvJLnCJJLMFMClHBBzQzwzbhlQHHPllbBhdb\n" +
            "qNFzGFFFnGGDJnzSdFdzjdvmCvzPzzRmgCmMmtgvcmtV\n" +
            "sQlhpLpWQQZpQZpQrBlLsLLCRggtMgVbbtggBmVVmbmBVm\n" +
            "ppQHRflRSGTdHSGN\n" +
            "BgTnWbbwPgPWgPGfGlWfdFFFlsSF\n" +
            "QvDNDZRMjCNZcHZZDQFShGFpBhdRsGpLsFRd\n" +
            "rrqvNcHjBcJgrTzbPVVz\n" +
            "pCjdsSdCljdBlpJpdmjHFHmDfTDTwgfgcw\n" +
            "WQrWnGzhNZzWfcnHfBwnvwHc\n" +
            "RLGNGQhWZhMrZNtBpsLPsVJbPLVb\n" +
            "TRDDSzNhHNHfSppCCMZsMMssdgZvfZ\n" +
            "GbGlctGqrBqVtrtLGtmqTtssPdMZcCZMnMvCZgdddgsP\n" +
            "BQqbVVVqLtBqWbTlmLBhQjFhJDRpHhzpJSJDNF\n" +
            "FTHTnPSmFqSPCTVDhZRCZDhjDRsV\n" +
            "blbLcBgMgMlrcLMbzrlBLZjRVsZZfNVfVfJsbNqDDh\n" +
            "tLtLQgzWMzSnHmPSWdqW\n" +
            "DnwmFcpmpGqFwCwmfCDMZsNVVMdlVrsNsczrrl\n" +
            "ghtBPJbHtWPbJPdBSPMzsrTTzZMTTMSNzrVZ\n" +
            "bPdjjhtPPJjjBQJJdbhRgJhLCnfLGGmLnGLpLfDRGGfpqG\n" +
            "HzzZZjCLjjZCmVQppssbGpmcTGgp\n" +
            "nMnJPqJlMPqBJllSJvlMSDGGBcgBcsfBhTpsFhgTTfFQ\n" +
            "drSRqnSqJDcSJrMJnRvCHtWZtjZZrHtVjrwZLj\n" +
            "mDJjmQggstPvDWJgQWJgPPmNFFLZpphZNlNpZLhSLvLZNf\n" +
            "rzzfTczCzCdBwddcCCHFpHFMNHZSHMFrHNFp\n" +
            "bcfzdGnCtVsVtsWn\n" +
            "CMfCfGfwbMMLdTMH\n" +
            "lqzDgLWqQWhQNWnlQqHTFFFFchbddTRbSddd\n" +
            "WnzDNZmPZmgglNCrvjrtrLffrJZJ\n" +
            "BllCMzjjlBHCCllHvljCMhbrQbTVTrvprTqrFWFFvF\n" +
            "ZNwfNLRnfwtRtNwqThVFpwWVJrbh\n" +
            "LnRnpNRSLcpZZNtmZmjgGgGMPBHCmMzsmsHM\n" +
            "MRMPpwWTLMMMMLLRMPbvfQZCnqQnqvWZWGqGDQ\n" +
            "gJslgmlmSZqssGGbnV\n" +
            "mJFSmmjcdmgJhdgrdjcdjwbRwpMwpHBRHrztwtRMRL\n" +
            "CccctqnQVvQcrsFwznmnrBrs\n" +
            "LLPThTSjPdJjLTtMBrsDmbbsBwbswGMF\n" +
            "jLSLWPLlTlgSlgSghdvtQZvqvWRcCpHVCqWp\n" +
            "DmggMZCDbdNrttnbPn\n" +
            "cclqSqGjSBwLqswNrFNzffFfNPsCsd\n" +
            "jGpLBcwlQBSpLjSQLvjRTZHTCRRDggRTHhmvmV\n" +
            "LWzrnwZFnzQlWQZndWFNvHBNDVBBNjplNjjVvV\n" +
            "RCSmPSCgsgTmCRqnsTCHvjJJpvBBSVSMpVjVMJ\n" +
            "sfgsRGnRTghQWWbLwfhF\n" +
            "JnJlTnDnwtWHMdJt\n" +
            "phNPDPVvPcPPvMRqVZRWMqRRWM\n" +
            "fGGScQDfssQzLbgT\n" +
            "rLVVdSSvVzQSRnzSRRnBQMJqDTjMsMsMqqPPhP\n" +
            "wmbWWFGVlGfptbhshsTmhqDPJJMm\n" +
            "CbWtWlCNpglgbtCWtFHdvNHVZnZZVnNVHHcc\n" +
            "qtRszqSZVnTCVwwLJpcgppLHqp\n" +
            "MPvBGNnDWMGMPDvGBPvMBFvpppjHwHpJJJJJFjjwLcjLJg\n" +
            "hBfPNvGvhDnvMPdslCZCtVsRRCSZff\n" +
            "HgvgvLNDcCcNBPDDvNNBzLNBnnhQqwRnRLQhWRhhWssqsnZZ\n" +
            "FlfprJzttrrTlGpbJVQhRwwbnbsRWVnZss\n" +
            "FGmdJrFdJddmjFfTttpfftlDvHSDgCDHgvSgHPcBzMHSzj\n" +
            "dgHhCJbBbwgNcVzlvzvzQVzH\n" +
            "RZPjRRRDPnjrjSnfFrDsnvzWVlzLfGzvBVWccclcGl\n" +
            "nDDZPjjRnZmFstnZBrsZgtCgbtMdqbJdNqMdgdwg\n" +
            "LvdrGnDBGBGrvrGLJtdrmmcfClqllsqlmjsLmcQC\n" +
            "VpbwbwTSVVwpzZMRSVmsjDqCclclNZCjNjQq\n" +
            "PpzWwRMwTwFpwtJBHnhtdnDvvP\n" +
            "GCJSClmwzmSgrpPpSpgcrS\n" +
            "bjLpsspHMHvBTsDLjTDtbTBFRFrQQQPcgQgcFcFPcFcnPs\n" +
            "pBTBvqBHbDjHfJqlGlzWJGllWC\n" +
            "GgbGNjQGzzQvFcFfRFmFJbff\n" +
            "pHDSLLCqpqppPZVSCSDdncRFwfmZcRWRJfncmRJn\n" +
            "LDTTLSSDSMQgvNTmzz\n" +
            "bLjgLVlJnjSJjgLgLjqqMcMfddftcCCnCccfQfsC\n" +
            "FRRmphNRmmdwPHpBPswDftDzMCfMcfWMMC\n" +
            "FrvdvrPPFHhNRPvFRmFZVbggqbGjJglJbjjTrVjJ\n" +
            "cSpdczpfRQQGNGGqvGHv\n" +
            "wPwFPhCFWbbmChwWmhFPsWrsDVwqVqZqvVVVvzGHDZqHqtZz\n" +
            "gbPznCbPmmWrWbWhJRpLnLRnTcScRSSLBd\n" +
            "pfwbrjTbDczbzbPcwTQbvWdWWTdddSldVHWSgHgn\n" +
            "mQmFQRFssJJJJthtJmBJmCHMdlWdnlltnHSVlSlgtnvM\n" +
            "BJBhRhRqRLRJNhJhBDwjzPPPcNQZrZrzDr\n" +
            "HTHwQJzwLZNcTwJtFRFHDtFvRFRFdr\n" +
            "jlMnMlbqqpMBvsWBVGRRGdSVgrDthFDddh\n" +
            "qvMjjMMpbPWqmMjnlpplpnWscNwLCQPzQLfzTzcZJfLQLPJz\n" +
            "gCTHTVdPdPvFfdCCSScZSZncMMCGGM\n" +
            "LNqLlssmWlLqzBRzWBwWBRRZdmJZcSSQDncnJtQcGDDDMd\n" +
            "jszNLwNWRRrzNbhbvHpdTjdvfH\n" +
            "NgDWhQmhfFlWFWlzDfhpBwfPBBdwwBJRBPqJJB\n" +
            "HHMCcHtGcMMbSGjScMGLSsRnqdJJlqqpCPJBRpBRdp\n" +
            "trMtLVtjjVtjttGctrLLTlZmgFzZTZzZNQmzZDNFhgFD\n" +
            "MBMtFzBnzSJJttSZBNNZfTsPqTqqqNZNPc\n" +
            "LlQDQLVCwCDbfRCmRGVjCwLLcqslNcNPgqgTPTsqNNsvqHqs\n" +
            "RfffRmdjnnzpndtr\n" +
            "nzpnDRDVwRRjVTSlTtlSSCQLDC\n" +
            "vgZHFBbbfCbvFbrFSSTqqcGtGTtBGQqS\n" +
            "HggMfPfbFZbPvNvgZZdHsnJjCzphzVwJjsmpmjMw\n" +
            "FgvgrgDpRDGTTWVDVd\n" +
            "zmbnNhHHQHshhhcbnHnnbBTMBMLLWLLGMqWLfzLLTV\n" +
            "mnnQHjcHHJmnNcHnnhmvZpRrCVZVZFrRJZVPFr\n" +
            "ZhpVhCSHbsCPbnmF\n" +
            "GBWGGrftTJlrfttQqsVPbPnGjDszFVncsG\n" +
            "qfMlQJWBrNWQfftqrQqBhRvdVVSNVSpZdvSZwZRS\n" +
            "mfzRQqMrtCwLMMZM\n" +
            "sbVbWgFdJCldtNRPNZ\n" +
            "FpggcgsjJccJVJJJcbbWWGrHnfmBnrHzfnfzvqrQmpfR\n" +
            "rWvbrfLnHHnzlFrFWWzJfRQQTwbwRQmQQCgQTwQBwg\n" +
            "MPsqcZpZdpjGMptpqCSsSwRNjQTBhgwhmgwgmmwgBm\n" +
            "SZqqqCDGMtpMFFDvFHfJlvDJ\n" +
            "RZnrZLZbLjRZwdlrnbLClCHMNCTlMMWBPPTHlT\n" +
            "SDgDzQDcfzJBNPssWCwSMN\n" +
            "fpQJwmmQmjhjGRbr\n" +
            "jQzqvLzvMTTQMMSS\n" +
            "VJlSrnBRZbbJbVnWWBlVWRCSNTMppMBMmmNPHMcNBmTMGmHp\n" +
            "CtDZJllRClbFzLtszhqFqS\n" +
            "VwcwzBdmMzJSdMBzzGndGSmlbqbgZgfblTJrTbrqZbTlTb\n" +
            "tRDvCvCRDCDWtPjCHjvDWTgZLfNqclZTTrNfZtLbLc\n" +
            "DDvPhhRRvjFjHPRjvVdMwhnpwBSGcwSGcc\n" +
            "LRtLJSNLdNLjNLRRNdRzVmVrggWmmmpVmpVvBBWFvm\n" +
            "wqfZnsMnhCnlfGPCCqwphJpWrFHBWHrvTrTHTH\n" +
            "ZsbGsflwGtjJbzLLjt\n" +
            "MjdFCjzsQFJQjzbmWHHLPPTfvsLfPZ\n" +
            "cNgpBgplzVvPTvmLPTVm\n" +
            "qNlqpcNtBzjQQCQqJjwJ\n" +
            "cczNGcgNhztlGPCCLDpBSpfVDpCJpSpBWs\n" +
            "nFqnwrRQrHnFHTMnZqQwMnmFsVsfbSSSJBSsfVVDfWVBWbVm\n" +
            "RRFZFMHjrQMjrHZqRjLdchdGtGjzDLgtzN\n" +
            "tzFmNfFNmFclrffhNtNlDWRSdFWnJCnRvRjvJvjD\n" +
            "LMgZgpZLMpPPPVPMMPbjbndWJSnWbWHWSCRbJD\n" +
            "BLwMpgMPgwQpTgTTpMVZMTftcGhhhtrhhcGGzQhsllCN\n" +
            "DWtHFWDHtwsWFHWDWwQblVgnllRBnjvBlVjRVbll\n" +
            "TzChCMGfNhZSLhLhzRRVvvjmczRgvRmv\n" +
            "pZSGpNJhCNGLSNLfMGJfJJQFrDDQDqHHgHpsWPFDttQW\n" +
            "qqccVQZWBVfjzzPVDMJtDtNccCgmtCCm\n" +
            "lvBRHBRGRDDCRmnmbD\n" +
            "SLFpGTSsTSsLFsHGvLvdGvdVwZBzZqqzjdQdZjVfrqwW\n" +
            "dLLwHLTWwjMLRZHCHZglDvjgvvNNDssSsmmN\n" +
            "nPfJPFbnhMJQfnpJGQJfQBBVssglsmsVVmBDsSqDgvNlgv\n" +
            "FbMrPPhrtGbJpnhJpJFFbbpJcwtdZzHZZwHCZdwctzTLcHTw\n" +
            "hCfzfLVbShRwRlBjdzmz\n" +
            "JZhrMMhZgvHFHJnHGgWdpmpnmlpRwBndRBwcBj\n" +
            "rMHFhgHZqtGvrWsbPfPNSbstTffN\n" +
            "dSwQQdSlHtlVQtqqrMZbFBRnBfZRMbDwMw\n" +
            "GTpcgLcvWvGvJzGpZGJpWpfmMWPBmDPRFPMFMmBfbFFW\n" +
            "hpcGhTCsGspLchGGzcpvZNStQHSSlNjjtlttlQsq\n" +
            "nJlhHlLlJGlRnMSsMLsnsSMwFHgwrTBFFwjBjppgpqfwqf\n" +
            "QmzzmbzNcZQQzDVZDcZQNDtzRqRBFTqTjjwpjBBNRrpBwfww\n" +
            "mvQPbQtttVVDzvzmRWCWLhSSslvWLGlW\n" +
            "nSpdSDPpRdrNBhMBMSJJ\n" +
            "bzCTcwzbczCZswMssczmCCgcqBmrQrrmBmqJBVBVNtrVttrq\n" +
            "cvzscgZzwTCsWsZvwTfzljDHnflMGMMndHFDdRPp\n" +
            "sDDnzLVnsMtjnDgfSSbfBjggbqBC\n" +
            "rlrlcppWcGdPrZNccJrSBSmCHqbSqCbSCgCHPq\n" +
            "NWcZgpFFgFpDFnDvtMDFzz\n" +
            "ZpczTjpZcnncHFDn\n" +
            "hSqqJWWWRRhlnFDVSFnQCB\n" +
            "qhNMWfqfMhJJRLRvppDzNZTpPTvwwD\n" +
            "rbSDCwPWwPVcSHcwHspNpNsddszmwGtswN\n" +
            "vBBfgQvBMvMvjLLlllqtBTNNTPPzTztTsRNPTt\n" +
            "vvQnjlMjjjqJqQLSrcDcPWbcHbDrDn\n" +
            "BphwqbwNsjsNsBdDjjhGpsGWzMMTWRTCflfDWSSzfzSlWf\n" +
            "cFnrrHrnZVZQQvFFVvZhRzTCWlSRMSWhZMWt\n" +
            "HvJVvggHvVrmQLqmNqLBbhsssw\n" +
            "NcBqSjGGBjNbZcHwhRVHPwPwPlZR\n" +
            "TvdtdtvFgHwWgdhn\n" +
            "tMJFTvtvFtrLJMHBqNNBzjrQcjqNmB\n" +
            "RrQfLfQvMFdQvLLQVfFcnbSbnwVSnbDslsbSDzDD\n" +
            "PHLjmHqqZCjPglsbwJbqnDbbJl\n" +
            "LNHLhjBHHGRfphphrtfh\n" +
            "FcdMchqcgdchqcfcNWWghNrRrVRjGHFjDJmGFDrRVGJD\n" +
            "zQtvBvtbQzpSzBptzbBznnwZJRDRVmVnGRGrDrHjZGrr\n" +
            "HLspTpQLBqWqLqcNgM\n" +
            "rnqbSSQhsshFqQQnsPSnhbnrzHzzHLNvLHCLFCvVJTlNLJTz\n" +
            "fcffljGBwgmwwftzNdCCdvLvtHNLTH\n" +
            "BjWgMGjjWZMwjjgwgMWpwPlnnqSnqQhnrbPMRDsqQs\n" +
            "hRJhFdNJcrbqbbMF\n" +
            "qZlTTgTvlHnqvllPssQrgQcQwscrQMsf\n" +
            "CClpSnTllZnZCDLHnlNzGSRmRthVmmzqJzhd\n" +
            "DLzSMtDLtzmmlDlMlMDbcrcTDqFvVvVqqTbD\n" +
            "dnZshHpZRChgnszRwRZCpTqqTcwVqFcrVqcBVPqVTr\n" +
            "snRRRdJsZgphCWlWtmJSjWWzjt";
}
