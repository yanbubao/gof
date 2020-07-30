package april.pattern.structural.facade.demo;

import april.pattern.structural.facade.demo.service.PaymentService;
import april.pattern.structural.facade.demo.service.QualifyService;
import april.pattern.structural.facade.demo.service.ShippingService;

/**
 * @author yanzx
 */
public class FacadeService {
    private final QualifyService qualifyService = new QualifyService();
    private final PaymentService paymentService = new PaymentService();
    private final ShippingService shippingService = new ShippingService();

    public void exchange(GiftInfo giftInfo) {
        if (qualifyService.isAvailable(giftInfo)) {
            if (paymentService.pay(giftInfo)) {
                String shippingNo = shippingService.delivery(giftInfo);
                System.out.println("物流系统下单成功，物流单号是：" + shippingNo);
            }
        }
    }
}
